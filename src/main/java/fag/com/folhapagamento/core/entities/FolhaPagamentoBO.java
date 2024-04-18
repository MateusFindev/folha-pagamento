package fag.com.folhapagamento.core.entities;

import fag.com.folhapagamento.core.enums.*;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FolhaPagamentoBO {

    private Long id;

    ColaboradorBO colaborador;

    BigDecimal salarioBruto;

    BigDecimal salarioLiquido;

    int totalColaboradoras;

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

        return totalDescontos;
    }

    private BigDecimal calcularBeneficios() {
        BigDecimal salarioBase = colaborador.getSalarioBase();
        BigDecimal totalBeneficios = BigDecimal.ZERO;

        for (ColaboradorBeneficioBO colaboradorBeneficio : colaborador.getBeneficios()) {
            BeneficioBO beneficio = colaboradorBeneficio.getBeneficio();

            BigDecimal valorBeneficio = BigDecimal.ZERO;
            if (beneficio.getTipoBeneficio() == EnumTipoBeneficio.ADICIONAL_INSALUBRIDADE) {
                BigDecimal valor = colaboradorBeneficio.isUsarPadrao() ? beneficio.getValorPadrao() : colaboradorBeneficio.getValor();

                valorBeneficio = beneficio.calcularAdicionarInsalubridade(colaborador.getSalarioBase(), valor);
            } else if (beneficio.getTipoBeneficio() == EnumTipoBeneficio.ADICIONAL_PERICULOSIDADE) {
                BigDecimal valor = colaboradorBeneficio.isUsarPadrao() ? beneficio.getValorPadrao() : colaboradorBeneficio.getValor();

                valorBeneficio = beneficio.calcularAdicionarPericulosidade(colaborador.getSalarioBase(), valor);
            } else if (beneficio.getTipoBeneficio() == EnumTipoBeneficio.AUXILIO_CRECHE) {
                if (totalColaboradoras < 30) {
                    continue;
                }
            } else {
                if (colaboradorBeneficio.isUsarPadrao()) {
                    valorBeneficio = totalBeneficios.add(beneficio.getValorPadrao());
                } else {
                    valorBeneficio = totalBeneficios.add(colaboradorBeneficio.getValor());
                }

                if (beneficio.getTipoValor() != EnumTipoValor.MOEDA) {
                    colaboradorBeneficio.setValor(valorBeneficio);
                }
            }

            totalBeneficios = totalBeneficios.add(valorBeneficio);
        }

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

    public int getTotalColaboradoras() {
        return totalColaboradoras;
    }

    public void setTotalColaboradoras(int totalColaboradoras) {
        this.totalColaboradoras = totalColaboradoras;
    }

}
