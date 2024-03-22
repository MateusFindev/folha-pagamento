package fag.com.folhapagamento.core.dtos;

import java.math.BigDecimal;

public class ColaboradorDescontoDTO {

    private ColaboradorDTO colaborador;
    private DescontoDTO desconto;
    private BigDecimal valor;
    private boolean ativo;

    public ColaboradorDTO getColaborador() {
        return colaborador;
    }

    public void setColaborador(ColaboradorDTO colaborador) {
        this.colaborador = colaborador;
    }

    public DescontoDTO getDesconto() {
        return desconto;
    }

    public void setDesconto(DescontoDTO desconto) {
        this.desconto = desconto;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
