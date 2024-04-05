package fag.com.folhapagamento.core.entities;

import fag.com.folhapagamento.core.enums.EnumPrazo;
import fag.com.folhapagamento.core.enums.EnumTipoValor;

public class DescontoBO {
    private String nome;

    private String codigo;

    private String descricao;

    private EnumTipoValor tipoValor;

    private EnumPrazo prazo;

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

    public EnumTipoValor getTipoValor() {
        return tipoValor;
    }

    public void setTipoValor(EnumTipoValor tipoValor) {
        this.tipoValor = tipoValor;
    }

    public EnumPrazo getPrazo() {
        return prazo;
    }

    public void setPrazo(EnumPrazo prazo) {
        this.prazo = prazo;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

}
