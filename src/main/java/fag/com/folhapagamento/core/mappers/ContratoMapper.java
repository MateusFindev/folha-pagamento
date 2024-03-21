package fag.com.folhapagamento.core.mappers;

import fag.com.folhapagamento.core.dtos.ContratoDTO;
import fag.com.folhapagamento.core.entities.ContratoBO;

public class ContratoMapper {

    public static ContratoDTO toDTO(ContratoBO bo) {
        ContratoDTO dto = new ContratoDTO();

        dto.setTipo(bo.getTipo());
        dto.setCargaHoraria(bo.getCargaHoraria());
        dto.setTipoFiliacao(bo.getTipoFiliacao());
        dto.setEmpresa(EmpresaMapper.toDTO(bo.getEmpresa()));

        return dto;
    }

    public static ContratoBO toBO(ContratoDTO dto) {
        ContratoBO bo = new ContratoBO();

        bo.setTipo(dto.getTipo());
        bo.setCargaHoraria(dto.getCargaHoraria());
        bo.setTipoFiliacao(dto.getTipoFiliacao());
        bo.setEmpresa(EmpresaMapper.toBO(dto.getEmpresa()));

        return bo;
    }

}
