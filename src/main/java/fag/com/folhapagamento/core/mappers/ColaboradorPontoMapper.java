package fag.com.folhapagamento.core.mappers;

import fag.com.folhapagamento.core.dtos.ColaboradorPontoDTO;
import fag.com.folhapagamento.core.entities.ColaboradorPontoBO;

public class ColaboradorPontoMapper {

    public static ColaboradorPontoDTO toDTO(ColaboradorPontoBO bo) {
        ColaboradorPontoDTO dto = new ColaboradorPontoDTO();

        dto.setId(bo.getId());
        dto.setDiasTrabalhados(bo.getDiasTrabalhados());
        dto.setFaltas(bo.getFaltas());
        dto.setHorasAtraso(bo.getHorasAtraso());
        dto.setHoras50(bo.getHoras50());
        dto.setHoras100(bo.getHoras100());
        dto.setMes(bo.getMes());

        if (dto.getColaborador() != null) {
            dto.setColaborador(ColaboradorMapper.toDTO(bo.getColaborador()));
        }

        return dto;
    }

    public static ColaboradorPontoBO toBO(ColaboradorPontoDTO dto) {
        ColaboradorPontoBO bo = new ColaboradorPontoBO();

        bo.setId(dto.getId());
        bo.setDiasTrabalhados(dto.getDiasTrabalhados());
        bo.setFaltas(dto.getFaltas());
        bo.setHorasAtraso(dto.getHorasAtraso());
        bo.setHoras50(dto.getHoras50());
        bo.setHoras100(dto.getHoras100());
        bo.setMes(dto.getMes());

        if (bo.getColaborador() != null) {
            bo.setColaborador(ColaboradorMapper.toBO(dto.getColaborador()));
        }

        return bo;
    }

}
