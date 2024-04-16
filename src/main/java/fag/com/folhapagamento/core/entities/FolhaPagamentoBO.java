package fag.com.folhapagamento.core.entities;

import fag.com.folhapagamento.core.enums.EnumMes;
import fag.com.folhapagamento.core.enums.EnumTipoDesconto;

import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

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

        this.salarioLiquido = colaborador.getSalarioBase().subtract(totalDescontos);
    }

    public static int calcularDiasUteis(int ano, int mes) {
        int totalDiasUteis = 0;
        LocalDate data = LocalDate.of(ano, mes, 1);

        while (data.getMonthValue() == mes) {
            if (data.getDayOfWeek() != DayOfWeek.SATURDAY && data.getDayOfWeek() != DayOfWeek.SUNDAY) {
                totalDiasUteis++;
            }

            data = data.plusDays(1);
        }

        return totalDiasUteis;
    }

    private BigDecimal calcularDescontos() {
        List<DescontoBO> descontos = colaborador.getDescontos().stream().map(ColaboradorDescontoBO::getDesconto).toList();

        BigDecimal totalDescontos = BigDecimal.ZERO;

        for (DescontoBO desconto : descontos) {
            if (desconto.getTipoDesconto() == EnumTipoDesconto.INSS) {
                totalDescontos = totalDescontos.add(desconto.calcularDescontoINSS(colaborador.getSalarioBase()));
            }

            if (desconto.getTipoDesconto() == EnumTipoDesconto.IRRF) {
                totalDescontos = totalDescontos.add(desconto.calcularDescontoIRRF(colaborador.getSalarioBase()));
            }
        }

        return totalDescontos;
    }

    private BigDecimal calcularBeneficios() {
        return BigDecimal.ZERO;
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
