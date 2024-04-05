package fag.com.folhapagamento.core.mappers;

import fag.com.folhapagamento.core.dtos.DependenteDTO;
import fag.com.folhapagamento.core.entities.DependenteBO;

public class DependenteMapper {

    public static DependenteDTO toDTO(DependenteBO bo) {
        DependenteDTO dto = new DependenteDTO();

        dto.setId(bo.getId());
        dto.setNome(bo.getNome());
        dto.setNascimento(bo.getNascimento());
        dto.setColaborador(ColaboradorMapper.toDTO(bo.getColaborador()));
        dto.setParentesco(bo.getParentesco());

        return dto;
    }

    public static DependenteBO toBO(DependenteDTO dto) {
        DependenteBO bo = new DependenteBO();

        bo.setId(dto.getId());
        bo.setNome(dto.getNome());
        bo.setNascimento(dto.getNascimento());
        bo.setColaborador(ColaboradorMapper.toBO(dto.getColaborador()));
        bo.setParentesco(dto.getParentesco());

        return bo;
    }

}
