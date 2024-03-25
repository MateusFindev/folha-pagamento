package fag.com.folhapagamento.core.dtos;

import fag.com.folhapagamento.core.enums.EnumParentesco;

import java.util.Date;

public class DependenteDTO {

    private String nome;

    private Date nascimento;

    private EnumParentesco parentesco;

    private ColaboradorDTO colaborador;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public EnumParentesco getParentesco() {
        return parentesco;
    }

    public void setParentesco(EnumParentesco parentesco) {
        this.parentesco = parentesco;
    }

    public ColaboradorDTO getColaborador() {
        return colaborador;
    }

    public void setColaborador(ColaboradorDTO colaborador) {
        this.colaborador = colaborador;
    }

}
