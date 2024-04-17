package fag.com.folhapagamento.core.entities;

import java.math.BigDecimal;

public class CargoBO {

    private Long id;

    private String nome;

    private String descricao;

    private Integer nivel;

    private String funcao;

    private BigDecimal salarioBase;

    private DepartamentoBO departamento;

    private boolean adPericulosidade;

    private boolean adInsalubridade;

    private boolean adFuncao;

    private boolean comissao;

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public BigDecimal getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(BigDecimal salarioBase) {
        this.salarioBase = salarioBase;
    }

    public DepartamentoBO getDepartamento() {
        return departamento;
    }

    public void setDepartamento(DepartamentoBO departamento) {
        this.departamento = departamento;
    }

    public boolean isAdPericulosidade() {
        return adPericulosidade;
    }

    public void setAdPericulosidade(boolean adPericulosidade) {
        this.adPericulosidade = adPericulosidade;
    }

    public boolean isAdInsalubridade() {
        return adInsalubridade;
    }

    public void setAdInsalubridade(boolean adInsalubridade) {
        this.adInsalubridade = adInsalubridade;
    }

    public boolean isAdFuncao() {
        return adFuncao;
    }

    public void setAdFuncao(boolean adFuncao) {
        this.adFuncao = adFuncao;
    }

    public boolean isComissao() {
        return comissao;
    }

    public void setComissao(boolean comissao) {
        this.comissao = comissao;
    }

}
