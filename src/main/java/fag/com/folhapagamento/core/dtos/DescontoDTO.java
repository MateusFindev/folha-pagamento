package fag.com.folhapagamento.core.dtos;

public class DescontoDTO {
    private String nome;

    private int codigo;

    private String descricao;

    private boolean ativo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {this.nome = nome;}

    public int getCodigo() {return codigo;}

    public void setCodigo(int codigo) {this.codigo = codigo;}

    public String getDescricao() {return descricao;}

    public void setDescricao(String descricao) {this.descricao = descricao;}

    public boolean isAtivo() {return ativo;}

    public void setAtivo(boolean ativo) {this.ativo = ativo;}
}
