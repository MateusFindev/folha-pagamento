package fag.com.folhapagamento.core.entities;

import fag.com.folhapagamento.core.enums.EnumGenero;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ColaboradorBO {

    private Long id;

    private String cpf;

    private String rg;

    private String cnh;

    private String nome;

    private String email;

    private Date admissao;

    private ContratoBO contrato;

    private EnumGenero genero;

    private List<DependenteBO> dependentes = new ArrayList<>();

    private List<ColaboradorBeneficioBO> beneficios = new ArrayList<>();

    private List<ColaboradorDescontoBO> descontos = new ArrayList<>();

    private List<ColaboradorPontoBO> pontos = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public EnumGenero getGenero() {
        return genero;
    }

    public void setGenero(EnumGenero genero) {
        this.genero = genero;
    }

    public BigDecimal getSalarioBase() {
        return contrato.getCargo().getSalarioBase();
    }

    public List<DependenteBO> getDependentes() {
        return dependentes;
    }

    public void setDependentes(List<DependenteBO> dependentes) {
        this.dependentes = dependentes;
    }

    public List<ColaboradorBeneficioBO> getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(List<ColaboradorBeneficioBO> beneficios) {
        this.beneficios = beneficios;
    }

    public List<ColaboradorDescontoBO> getDescontos() {
        return descontos;
    }

    public void setDescontos(List<ColaboradorDescontoBO> descontos) {
        this.descontos = descontos;
    }

    public List<ColaboradorPontoBO> getPontos() {
        return pontos;
    }

    public void setPontos(List<ColaboradorPontoBO> pontos) {
        this.pontos = pontos;
    }

}
