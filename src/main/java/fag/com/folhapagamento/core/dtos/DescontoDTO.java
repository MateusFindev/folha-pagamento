package fag.com.folhapagamento.core.dtos;

import fag.com.folhapagamento.core.enums.EnumPrazo;
import fag.com.folhapagamento.core.enums.EnumTipoDesconto;
import fag.com.folhapagamento.core.enums.EnumTipoValor;

public class DescontoDTO {

    private Long id;

    private String nome;

    private String codigo;

    private String descricao;

    private EnumTipoValor tipoValor;

    private EnumPrazo prazo;

    private EnumTipoDesconto tipoDesconto;

    private boolean ativo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public EnumTipoDesconto getTipoDesconto() {
        return tipoDesconto;
    }

    public void setTipoDesconto(EnumTipoDesconto tipoDesconto) {
        this.tipoDesconto = tipoDesconto;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

}
