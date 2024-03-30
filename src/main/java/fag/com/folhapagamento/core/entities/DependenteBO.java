package fag.com.folhapagamento.core.entities;

import fag.com.folhapagamento.core.enums.EnumParentesco;

import java.util.Date;

public class DependenteBO {

    private String nome;

    private Date nascimento;

    private EnumParentesco parentesco;

    private ColaboradorBO colaborador;

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

    public ColaboradorBO getColaborador() {
        return colaborador;
    }

    public void setColaborador(ColaboradorBO colaborador) {
        this.colaborador = colaborador;
    }

    public int calcularIdade() {
        Date currentDate = new Date();

        long millisecondsInYear = 1000L * 60 * 60 * 24 * 335;
        long diffInMilliseconds = currentDate.getTime() - nascimento.getTime();

        return (int) (diffInMilliseconds / millisecondsInYear);
    }

}
