package fag.com.folhapagamento.core.mappers;

import fag.com.folhapagamento.core.dtos.ColaboradorDTO;
import fag.com.folhapagamento.core.entities.ColaboradorBO;

public class ColaboradorMapper {

    public static ColaboradorDTO toDTO(ColaboradorBO bo) {
        ColaboradorDTO dto = new ColaboradorDTO();

        dto.setId(bo.getId());
        dto.setCpf(bo.getCpf());
        dto.setRg(bo.getRg());
        dto.setCnh(bo.getCnh());
        dto.setNome(bo.getNome());
        dto.setEmail(bo.getEmail());
        dto.setAdmissao(bo.getAdmissao());
        dto.setContrato(ContratoMapper.toDTO(bo.getContrato()));
        dto.setGenero(bo.getGenero());

        return dto;
    }

    public static ColaboradorBO toBO(ColaboradorDTO dto) {
        ColaboradorBO bo = new ColaboradorBO();

        bo.setId(dto.getId());
        bo.setCpf(dto.getCpf());
        bo.setRg(dto.getRg());
        bo.setCnh(dto.getCnh());
        bo.setNome(dto.getNome());
        bo.setEmail(dto.getEmail());
        bo.setAdmissao(dto.getAdmissao());
        bo.setContrato(ContratoMapper.toBO(dto.getContrato()));
        bo.setGenero(dto.getGenero());

        return bo;
    }

}
