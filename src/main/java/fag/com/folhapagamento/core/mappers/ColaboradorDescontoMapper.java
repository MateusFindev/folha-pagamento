package fag.com.folhapagamento.core.mappers;

import fag.com.folhapagamento.core.dtos.ColaboradorDescontoDTO;
import fag.com.folhapagamento.core.entities.ColaboradorDescontoBO;

public class ColaboradorDescontoMapper {
    public static ColaboradorDescontoDTO toDTO(ColaboradorDescontoBO bo) {
        ColaboradorDescontoDTO dto = new ColaboradorDescontoDTO();

        dto.setColaborador(ColaboradorMapper.toDTO(bo.getColaborador()));
        dto.setDesconto(DescontoMapper.toDTO(bo.getDesconto()));
        dto.setValor(bo.getValor());
        dto.setAtivo(bo.isAtivo());

        return dto;
    }

    public static ColaboradorDescontoBO toBO(ColaboradorDescontoDTO dto) {
        ColaboradorDescontoBO bo = new ColaboradorDescontoBO();

        bo.setColaborador(ColaboradorMapper.toBO(dto.getColaborador()));
        bo.setDesconto(DescontoMapper.toBO(dto.getDesconto()));
        bo.setValor(dto.getValor());
        bo.setAtivo(dto.isAtivo());

        return bo;
    }
}
