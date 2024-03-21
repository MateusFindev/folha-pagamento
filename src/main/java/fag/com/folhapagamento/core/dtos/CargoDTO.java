package fag.com.folhapagamento.core.dtos;

import java.math.BigDecimal;

public class CargoDTO {

    private String nome;

    private String descricao;

    private Integer nivel;

    private String funcao;

    private BigDecimal salarioBase;

    private boolean adPericulosidade;

    private boolean adInsalubridade;

    private boolean adFuncao;

    private boolean comissao;

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
