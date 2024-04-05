package fag.com.folhapagamento.core.entities;

import java.math.BigDecimal;

public class ColaboradorDescontoBO {

    private Long id;

    private ColaboradorBO colaborador;

    private DescontoBO desconto;

    private BigDecimal valor;

    private boolean ativo;

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

    public DescontoBO getDesconto() {
        return desconto;
    }

    public void setDesconto(DescontoBO desconto) {
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
