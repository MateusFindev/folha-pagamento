package fag.com.folhapagamento.core.dtos;

import fag.com.folhapagamento.core.enums.EnumCategoriaSegurado;
import fag.com.folhapagamento.core.enums.EnumTipoContrato;

public class ContratoDTO {

    private Long id;

    private EnumTipoContrato tipo;

    private Integer cargaHoraria;

    private EnumCategoriaSegurado tipoFiliacao;

    private CargoDTO cargo;

    private EmpresaDTO empresa;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public CargoDTO getCargo() {
        return cargo;
    }

    public void setCargo(CargoDTO cargo) {
        this.cargo = cargo;
    }

    public EmpresaDTO getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaDTO empresa) {
        this.empresa = empresa;
    }

}
