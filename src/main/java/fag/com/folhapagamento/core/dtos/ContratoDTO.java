package fag.com.folhapagamento.core.dtos;

import fag.com.folhapagamento.core.enums.EnumCategoriaSegurado;
import fag.com.folhapagamento.core.enums.EnumTipoContrato;

public class ContratoDTO {

    public EnumTipoContrato tipo;

    public Integer cargaHoraria;

    public EnumCategoriaSegurado tipoFiliacao;

    public EmpresaDTO empresa;

    public EnumTipoContrato getTipo() {
        return tipo;
    }

    public void setTipo(EnumTipoContrato tipo) {
        this.tipo = tipo;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public EnumCategoriaSegurado getTipoFiliacao() {
        return tipoFiliacao;
    }

    public void setTipoFiliacao(EnumCategoriaSegurado tipoFiliacao) {
        this.tipoFiliacao = tipoFiliacao;
    }

    public EmpresaDTO getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaDTO empresa) {
        this.empresa = empresa;
    }

}
