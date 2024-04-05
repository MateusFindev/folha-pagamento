package fag.com.folhapagamento.core.dtos;

import java.math.BigDecimal;
import java.util.List;

public class FolhaPagamentoDTO {

    private Long id;

    ColaboradorDTO colaborador;

    BigDecimal salarioBruto;

    BigDecimal salarioLiquido;

    List<ColaboradorDescontoDTO> descontos;

    String mes;

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

    public List<ColaboradorDescontoDTO> getDescontos() {
        return descontos;
    }

    public void setDescontos(List<ColaboradorDescontoDTO> descontos) {
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
