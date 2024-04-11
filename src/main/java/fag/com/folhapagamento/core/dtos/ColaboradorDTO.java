package fag.com.folhapagamento.core.dtos;

import fag.com.folhapagamento.core.enums.EnumGenero;

import java.util.Date;
import java.util.List;

public class ColaboradorDTO {

    private Long id;

    private String cpf;

    private String rg;

    private String cnh;

    private String nome;

    private String email;

    private Date admissao;

    private ContratoDTO contrato;

    private EnumGenero genero;

    private List<DependenteDTO> dependentes;

    private List<BeneficioDTO> beneficios;

    private List<DescontoDTO> descontos;

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

    public ContratoDTO getContrato() {
        return contrato;
    }

    public void setContrato(ContratoDTO contrato) {
        this.contrato = contrato;
    }

    public EnumGenero getGenero() {
        return genero;
    }

    public void setGenero(EnumGenero genero) {
        this.genero = genero;
    }

    public List<DependenteDTO> getDependentes() {
        return dependentes;
    }

    public void setDependentes(List<DependenteDTO> dependentes) {
        this.dependentes = dependentes;
    }

    public List<BeneficioDTO> getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(List<BeneficioDTO> beneficios) {
        this.beneficios = beneficios;
    }

    public List<DescontoDTO> getDescontos() {
        return descontos;
    }

    public void setDescontos(List<DescontoDTO> descontos) {
        this.descontos = descontos;
    }

}
