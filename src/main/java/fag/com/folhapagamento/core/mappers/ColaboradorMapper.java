package fag.com.folhapagamento.core.mappers;

import fag.com.folhapagamento.core.dtos.ColaboradorDTO;
import fag.com.folhapagamento.core.entities.ColaboradorBO;

public class ColaboradorMapper {

    public static ColaboradorDTO toDTO(ColaboradorBO bo) {
        ColaboradorDTO dto = new ColaboradorDTO();

        dto.setCpf(bo.getCpf());
        dto.setRg(bo.getRg());
        dto.setCnh(bo.getCnh());
        dto.setNome(bo.getNome());
        dto.setAdmissao(bo.getAdmissao());
        dto.setContrato(ContratoMapper.toDTO(bo.getContrato()));
        dto.setCargo(CargoMapper.toDTO(bo.getCargo()));
        dto.setGenero(bo.getGenero());

        return dto;
    }

    public static ColaboradorBO toBO(ColaboradorDTO dto) {
        ColaboradorBO bo = new ColaboradorBO();

        bo.setCpf(dto.getCpf());
        bo.setRg(dto.getRg());
        bo.setCnh(dto.getCnh());
        bo.setNome(dto.getNome());
        bo.setAdmissao(dto.getAdmissao());
        bo.setContrato(ContratoMapper.toBO(dto.getContrato()));
        bo.setCargo(CargoMapper.toBO(dto.getCargo()));
        bo.setGenero(dto.getGenero());

        return bo;
    }

}
