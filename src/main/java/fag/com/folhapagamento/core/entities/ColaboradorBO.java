package fag.com.folhapagamento.core.entities;

import java.util.Date;

public class ColaboradorBO {

    private String cpf;

    private String rg;

    private String cnh;

    private String nome;

    private Date admissao;

    private ContratoBO contrato;

    private Integer dependentes;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getAdmissao() {
        return admissao;
    }

    public void setAdmissao(Date admissao) {
        this.admissao = admissao;
    }

    public ContratoBO getContrato() {
        return contrato;
    }

    public void setContrato(ContratoBO contrato) {
        this.contrato = contrato;
    }

    public Integer getDependentes() {
        return dependentes;
    }

    public void setDependentes(Integer dependentes) {
        this.dependentes = dependentes;
    }

}
