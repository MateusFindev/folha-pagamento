package fag.com.folhapagamento.core.mappers;

import fag.com.folhapagamento.core.dtos.DepartamentoDTO;
import fag.com.folhapagamento.core.entities.DepartamentoBO;

public class DepartamentoMapper {

    public static DepartamentoDTO toDTO(DepartamentoBO bo) {
        DepartamentoDTO dto = new DepartamentoDTO();

        dto.setNome(bo.getNome());
        dto.setDescricao(bo.getDescricao());
        dto.setAtivo(bo.isAtivo());
        dto.setEmpresa(EmpresaMapper.toDTO(bo.getEmpresa()));

        return dto;
    }

    public static DepartamentoBO toBO(DepartamentoDTO dto) {
        DepartamentoBO bo = new DepartamentoBO();

        bo.setNome(dto.getNome());
        bo.setDescricao(dto.getDescricao());
        bo.setAtivo(dto.isAtivo());
        bo.setEmpresa(EmpresaMapper.toBO(dto.getEmpresa()));

        return bo;
    }

}
