package fag.com.folhapagamento.core.dtos;

import java.math.BigDecimal;

public class ColaboradorBeneficioDTO {

    private Long id;

    private ColaboradorDTO colaborador;

    private BeneficioDTO beneficio;

    private BigDecimal valor;

    private boolean usarPadrao;

    private boolean ativo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ColaboradorDTO getColaborador() {
        return colaborador;
    }

    public void setColaborador(ColaboradorDTO colaborador) {
        this.colaborador = colaborador;
    }

    public BeneficioDTO getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(BeneficioDTO beneficio) {
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
