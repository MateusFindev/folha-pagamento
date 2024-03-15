package fag.com.folhapagamento.core.entities;

import fag.com.folhapagamento.core.enums.EnumCategoriaSegurado;
import fag.com.folhapagamento.core.enums.EnumTipoContrato;

public class ContratoBO {

    public EnumTipoContrato tipo;

    public Integer cargaHoraria;

    public EnumCategoriaSegurado tipoFiliacao;

    public EmpresaBO empresa;

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

    public EmpresaBO getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaBO empresa) {
        this.empresa = empresa;
    }

}
