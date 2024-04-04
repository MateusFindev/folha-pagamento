package fag.com.folhapagamento.core.entities;

import java.math.BigDecimal;
import java.util.List;

public class FolhaPagamentoBO {

    ColaboradorBO colaborador;

    BigDecimal salarioBruto;

    BigDecimal salarioLiquido;

    List<ColaboradorDescontoBO> descontos;

    String mes;

    Integer diasUteis;

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

    public List<ColaboradorDescontoBO> getDescontos() {
        return descontos;
    }

    public void setDescontos(List<ColaboradorDescontoBO> descontos) {
        this.descontos = descontos;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public Integer getDiasUteis() {
        return diasUteis;
    }

    public void setDiasUteis(Integer diasUteis) {
        this.diasUteis = diasUteis;
    }

}