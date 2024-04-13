package fag.com.folhapagamento.core.entities;

import fag.com.folhapagamento.core.enums.EnumPrazo;
import fag.com.folhapagamento.core.enums.EnumTipoDesconto;
import fag.com.folhapagamento.core.enums.EnumTipoValor;

import java.math.BigDecimal;

public class DescontoBO {

    private Long id;

    private String nome;

    private String codigo;

    private String descricao;

    private EnumTipoValor tipoValor;

    private EnumPrazo prazo;

    private EnumTipoDesconto tipoDesconto;

    private boolean ativo;

    public BigDecimal calcularDescontoINSS(BigDecimal salario) {
        BigDecimal desconto;

        if (salario.compareTo(new BigDecimal("1412.00")) < 1) {
            desconto = salario.multiply(BigDecimal.valueOf(0.075d));
        } else if (salario.compareTo(new BigDecimal("2666.68")) < 1) {
            desconto = salario.multiply(BigDecimal.valueOf(0.09d));
        } else if (salario.compareTo(new BigDecimal("4000.03")) < 1) {
            desconto = salario.multiply(BigDecimal.valueOf(0.12d));
        } else {
            desconto = salario.multiply(BigDecimal.valueOf(0.14d));
        }

        desconto = desconto.subtract(calcularParcela(salario));

        return desconto;
    }

    public BigDecimal calcularDescontoIRRF(BigDecimal salario) {
        BigDecimal desconto;

        if (salario.compareTo(BigDecimal.valueOf(2259.20d)) < 1) {
            desconto = BigDecimal.ZERO;
        } else if (salario.compareTo(BigDecimal.valueOf(2826.65d)) < 1) {
            desconto = salario.multiply(BigDecimal.valueOf(0.075d)).subtract(BigDecimal.valueOf(158.40d));
        } else if (salario.compareTo(BigDecimal.valueOf(3751.05d)) < 1) {
            desconto = salario.multiply(BigDecimal.valueOf(0.15d)).subtract(BigDecimal.valueOf(370.40d));
        } else if (salario.compareTo(BigDecimal.valueOf(4664.68d)) < 1) {
            desconto = salario.multiply(BigDecimal.valueOf(0.225d)).subtract(BigDecimal.valueOf(651.73d));
        } else {
            desconto = salario.multiply(BigDecimal.valueOf(0.275d)).subtract(BigDecimal.valueOf(884.96d));
        }

        return desconto;
    }

    private BigDecimal calcularParcela(BigDecimal salario) {
        BigDecimal parcela;

        if (salario.compareTo(BigDecimal.valueOf(1412.00d)) < 1) {
            parcela = BigDecimal.ZERO;
        } else if (salario.compareTo(BigDecimal.valueOf(2666.68d)) < 1) {
            parcela = BigDecimal.valueOf(21.18d);
        } else if (salario.compareTo(BigDecimal.valueOf(4000.03d)) < 1) {
            parcela = BigDecimal.valueOf(78.36d);
        } else {
            parcela = BigDecimal.valueOf(181.18d);
        }

        return parcela;
    }

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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public EnumTipoValor getTipoValor() {
        return tipoValor;
    }

    public void setTipoValor(EnumTipoValor tipoValor) {
        this.tipoValor = tipoValor;
    }

    public EnumPrazo getPrazo() {
        return prazo;
    }

    public void setPrazo(EnumPrazo prazo) {
        this.prazo = prazo;
    }

    public EnumTipoDesconto getTipoDesconto() {
        return tipoDesconto;
    }

    public void setTipoDesconto(EnumTipoDesconto tipoDesconto) {
        this.tipoDesconto = tipoDesconto;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

}
