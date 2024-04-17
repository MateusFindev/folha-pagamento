package fag.com.folhapagamento.core.entities;

import fag.com.folhapagamento.core.enums.EnumTipoBeneficio;

import java.math.BigDecimal;

public class ColaboradorBeneficioBO {

    private Long id;

    private ColaboradorBO colaborador;

    private BeneficioBO beneficio;

    private BigDecimal valor;

    private boolean usarPadrao;

    private boolean ativo;

    public BigDecimal calcularSalarioFamilia(BigDecimal salarioLiquido) {
        BeneficioBO salarioFamilia = null;

        if (beneficio.getTipoBeneficio() == EnumTipoBeneficio.SALARIO_FAMILIA) {
            salarioFamilia = getBeneficio();
        }

        if (salarioFamilia == null) {
            return BigDecimal.ZERO;
        }

        if (salarioLiquido.compareTo(BigDecimal.valueOf(1819.26)) < 1) {
            int dependentes = colaborador.getDependentes().size();

            return salarioFamilia.getValorPadrao().multiply(BigDecimal.valueOf(dependentes));
        }

        return BigDecimal.ZERO;
    }

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
