package fag.com.folhapagamento.core.entities;

import fag.com.folhapagamento.core.enums.EnumMes;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ColaboradorPontoBO {

    private Long id;

    private ColaboradorBO colaborador;

    private Integer diasTrabalhados;

    private Integer faltas;

    private Integer horasAtraso;

    private Integer horas50;

    private Integer horas100;

    private EnumMes mes;

    private BigDecimal calcularValorHora() {
        BigDecimal salarioBase = colaborador.getSalarioBase();
        Integer cargaHoraria = colaborador.getContrato().getCargaHoraria();

        int horasTrabalhadas = diasTrabalhados * (cargaHoraria / 7);

        return salarioBase.divide(new BigDecimal(horasTrabalhadas), RoundingMode.HALF_EVEN);
    }

    public BigDecimal calcularValorHorasExtras() {
        BigDecimal valorHora = this.calcularValorHora();
        BigDecimal valorExtra50 = valorHora.multiply(new BigDecimal("1.5"));

        BigDecimal extra50 = valorExtra50.multiply(new BigDecimal(horas50));
        BigDecimal extra100 = valorHora.multiply(new BigDecimal(2));

        return extra50.add(extra100);
    }

    public BigDecimal calcularValorFaltas() {
        BigDecimal salarioBase = colaborador.getSalarioBase();

        BigDecimal valorDia = salarioBase.divide(new BigDecimal(diasTrabalhados), RoundingMode.HALF_EVEN);

        return valorDia.multiply(new BigDecimal(faltas));
    }

    public BigDecimal calcularValorHorasAtraso() {
        BigDecimal valorHora = this.calcularValorHora();

        return colaborador.getSalarioBase().multiply(new BigDecimal(horasAtraso));
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
