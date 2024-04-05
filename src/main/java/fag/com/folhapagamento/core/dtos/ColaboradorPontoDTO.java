package fag.com.folhapagamento.core.dtos;

import fag.com.folhapagamento.core.enums.EnumMes;

public class ColaboradorPontoDTO {

    private ColaboradorDTO colaborador;

    private Integer diasTrabalhados;

    private Integer faltas;

    private Integer horasAtraso;

    private Integer horas50;

    private Integer horas100;

    private EnumMes mes;

    public ColaboradorDTO getColaborador() {
        return colaborador;
    }

    public void setColaborador(ColaboradorDTO colaborador) {
        this.colaborador = colaborador;
    }

    public Integer getDiasTrabalhados() {
        return diasTrabalhados;
    }

    public void setDiasTrabalhados(Integer diasTrabalhados) {
        this.diasTrabalhados = diasTrabalhados;
    }

    public Integer getFaltas() {
        return faltas;
    }

    public void setFaltas(Integer faltas) {
        this.faltas = faltas;
    }

    public Integer getHorasAtraso() {
        return horasAtraso;
    }

    public void setHorasAtraso(Integer horasAtraso) {
        this.horasAtraso = horasAtraso;
    }

    public Integer getHoras50() {
        return horas50;
    }

    public void setHoras50(Integer horas50) {
        this.horas50 = horas50;
    }

    public Integer getHoras100() {
        return horas100;
    }

    public void setHoras100(Integer horas100) {
        this.horas100 = horas100;
    }

    public EnumMes getMes() {
        return mes;
    }

    public void setMes(EnumMes mes) {
        this.mes = mes;
    }

}
