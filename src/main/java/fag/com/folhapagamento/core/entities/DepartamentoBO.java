package fag.com.folhapagamento.core.entities;

public class DepartamentoBO {

    private String nome;

    private String descricao;

    private boolean ativo;

    private EmpresaBO empresa;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public EmpresaBO getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaBO empresa) {
        this.empresa = empresa;
    }

}