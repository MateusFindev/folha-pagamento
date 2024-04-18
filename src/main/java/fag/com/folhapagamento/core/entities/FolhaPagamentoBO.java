package fag.com.folhapagamento.core.entities;

import fag.com.folhapagamento.core.enums.*;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FolhaPagamentoBO {

    private Long id;

    ColaboradorBO colaborador;

    BigDecimal salarioBruto;

    BigDecimal salarioLiquido;

    EnumMes mes;

    Integer diasUteis;

    public void calcularSalarioLiquido() {
        BigDecimal totalDescontos = calcularDescontos();
        BigDecimal totalBeneficios = calcularBeneficios();

        this.salarioLiquido = colaborador.getSalarioBase().subtract(totalDescontos).add(totalBeneficios);
    }

    private BigDecimal calcularDescontos() {
        BigDecimal salarioBase = colaborador.getSalarioBase();
        BigDecimal totalDescontos = BigDecimal.ZERO;

        for (ColaboradorDescontoBO colaboradorDesconto : colaborador.getDescontos()) {
            DescontoBO desconto = colaboradorDesconto.getDesconto();

            BigDecimal valorDesconto = BigDecimal.ZERO;
            if (desconto.getTipoDesconto() == EnumTipoDesconto.INSS) {
                valorDesconto = desconto.calcularDescontoINSS(colaborador.getSalarioBase());

                colaboradorDesconto.setValor(valorDesconto);
            } else if (desconto.getTipoDesconto() == EnumTipoDesconto.IRRF) {
                valorDesconto = desconto.calcularDescontoIRRF(colaborador.getSalarioBase());

                colaboradorDesconto.setValor(valorDesconto);
            } else {
                if (desconto.getTipoValor() != EnumTipoValor.MOEDA) {
                    valorDesconto = salarioBase.multiply(colaboradorDesconto.getValor().divide(BigDecimal.valueOf(100d), RoundingMode.HALF_EVEN));

                    colaboradorDesconto.setValor(valorDesconto);
                }

                totalDescontos = totalDescontos.add(valorDesconto);
            }
        }

        ColaboradorPontoBO ultimoPonto = colaborador.getPontos().get(colaborador.getPontos().size() - 1);
        ultimoPonto.setColaborador(colaborador); // isso aqui é gambiarra

        BigDecimal horasFaltas = ultimoPonto.calcularValorFaltas();
        BigDecimal horasAtraso = ultimoPonto.calcularValorHorasAtraso();

        totalDescontos = totalDescontos.add(horasFaltas).add(horasAtraso);

        return totalDescontos;
    }

    private BigDecimal calcularBeneficios() {
        BigDecimal salarioBase = colaborador.getSalarioBase();
        BigDecimal totalBeneficios = BigDecimal.ZERO;

        for (ColaboradorBeneficioBO colaboradorBeneficio : colaborador.getBeneficios()) {
            BeneficioBO beneficio = colaboradorBeneficio.getBeneficio();

            if (colaboradorBeneficio.isUsarPadrao()) {
                totalBeneficios = totalBeneficios.add(beneficio.getValorPadrao());
            } else {
                totalBeneficios = totalBeneficios.add(colaboradorBeneficio.getValor());
            }
        }

        ColaboradorPontoBO ultimoPonto = colaborador.getPontos().get(colaborador.getPontos().size() - 1);
        ultimoPonto.setColaborador(colaborador); // isso aqui é gambiarra

        BigDecimal horasExtras = ultimoPonto.calcularValorHorasExtras();

        totalBeneficios = totalBeneficios.add(horasExtras);

        ColaboradorBeneficioBO salarioFamilia = colaborador.getBeneficios().stream()
                .filter(beneficio -> beneficio.getBeneficio().getTipoBeneficio() == EnumTipoBeneficio.SALARIO_FAMILIA)
                .toList().stream().findFirst().orElse(null);

        if (salarioFamilia != null) {
            totalBeneficios = totalBeneficios.add(salarioFamilia.calcularSalarioFamilia(salarioBase.add(totalBeneficios)));
        }

        return totalBeneficios;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ColaboradorBO getColaborador() {
        return colaborador;
    }

    public void setColaborador(ColaboradorBO colaborador) {
        this.colaborador = colaborador;
    }

    public BigDecimal getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(BigDecimal salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public BigDecimal getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(BigDecimal salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    public EnumMes getMes() {
        return mes;
    }

    public void setMes(EnumMes mes) {
        this.mes = mes;
    }

    public Integer getDiasUteis() {
        return diasUteis;
    }

    public void setDiasUteis(Integer diasUteis) {
        this.diasUteis = diasUteis;
    }

}
