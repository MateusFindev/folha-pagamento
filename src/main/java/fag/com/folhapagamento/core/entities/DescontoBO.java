package fag.com.folhapagamento.core.entities;

public class DescontoBO {
    private String nome;

    private String codigo;

    private String descricao;

    private boolean ativo;

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getCodigo() {return codigo;}

    public void setCodigo(String codigo) {this.codigo = codigo;}

    public String getDescricao() {return descricao;}

    public void setDescricao(String descricao) {this.descricao = descricao;}

    public boolean isAtivo() {return ativo;}

    public void setAtivo(boolean ativo) {this.ativo = ativo;}

}
