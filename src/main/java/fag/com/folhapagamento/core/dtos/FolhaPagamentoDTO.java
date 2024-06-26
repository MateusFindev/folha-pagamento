package fag.com.folhapagamento.core.dtos;

import fag.com.folhapagamento.core.enums.EnumMes;

import java.math.BigDecimal;

public class FolhaPagamentoDTO {

    private Long id;

    ColaboradorDTO colaborador;

    BigDecimal salarioBruto;

    BigDecimal salarioLiquido;

    EnumMes mes;

    int totalColaboradoras;

    Integer diasUteis;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ColaboradorDTO getColaborador() {
        return colaborador;
    }

    public void setColaborador(ColaboradorDTO colaborador) {
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
