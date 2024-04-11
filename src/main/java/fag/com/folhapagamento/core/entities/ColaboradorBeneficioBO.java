package fag.com.folhapagamento.core.entities;

import java.math.BigDecimal;

public class ColaboradorBeneficioBO {

    private Long id;

    private ColaboradorBO colaborador;

    private BeneficioBO beneficio;

    private BigDecimal valor;

    private boolean usarPadrao;

    private boolean ativo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ColaboradorBO getColaborador() {
        return colaborador;
    }

    public void setColaborador(ColaboradorBO colaborador) {
        this.colaborador = colaborador;
    }

    public BeneficioBO getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(BeneficioBO beneficio) {
        this.beneficio = beneficio;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public boolean isUsarPadrao() {
        return usarPadrao;
    }

    public void setUsarPadrao(boolean usarPadrao) {
        this.usarPadrao = usarPadrao;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

}
