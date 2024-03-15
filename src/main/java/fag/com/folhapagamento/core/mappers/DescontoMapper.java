package fag.com.folhapagamento.core.mappers;

import fag.com.folhapagamento.core.dtos.DescontoDTO;
import fag.com.folhapagamento.core.entities.DescontoBO;

public class DescontoMapper {

    public static DescontoDTO toDTO(DescontoBO bo) {
        DescontoDTO dto = new DescontoDTO();

        dto.setCodigo(bo.getCodigo());
        dto.setDescricao(bo.getDescricao());
        dto.setAtivo(bo.isAtivo());
        dto.setNome(bo.getNome());

        return dto;
    }

    public static DescontoBO toBO(DescontoDTO dto) {
        DescontoBO bo = new DescontoBO();

        bo.setCodigo(dto.getCodigo());
        bo.setDescricao(dto.getDescricao());
        bo.setAtivo(dto.isAtivo());
        bo.setNome(bo.getNome());

        return bo;
    }

}
