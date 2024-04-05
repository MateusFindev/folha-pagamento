package fag.com.folhapagamento.core.dtos;

import fag.com.folhapagamento.core.enums.EnumTipoValor;

import java.math.BigDecimal;

public class BeneficioDTO {
    private String nome;

    private String codigo;

    private String descricao;

    private BigDecimal valorPadrao;

    private EnumTipoValor tipoValor;

    private boolean ativo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValorPadrao() {
        return valorPadrao;
    }

    public void setValorPadrao(BigDecimal valorPadrao) {
        this.valorPadrao = valorPadrao;
    }

    public EnumTipoValor getTipoValor() {
        return tipoValor;
    }

    public void setTipoValor(EnumTipoValor tipoValor) {
        this.tipoValor = tipoValor;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}