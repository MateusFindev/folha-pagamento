package fag.com.folhapagamento.core.mappers;

import fag.com.folhapagamento.core.dtos.BeneficioDTO;
import fag.com.folhapagamento.core.dtos.DescontoDTO;
import fag.com.folhapagamento.core.entities.BeneficioBO;
import fag.com.folhapagamento.core.entities.DescontoBO;

public class BeneficioMapper {
    public static BeneficioDTO toDTO(BeneficioBO bo) {
        BeneficioDTO dto = new BeneficioDTO();

        dto.setCodigo(bo.getCodigo());
        dto.setDescricao(bo.getDescricao());
        dto.setAtivo(bo.isAtivo());
        dto.setNome(bo.getNome());
        dto.setValorPadrao(bo.getValorPadrao());

        return dto;
    }

    public static BeneficioBO toBO(BeneficioDTO dto) {
        BeneficioBO bo = new BeneficioBO();

        bo.setCodigo(dto.getCodigo());
        bo.setDescricao(dto.getDescricao());
        bo.setAtivo(dto.isAtivo());
        bo.setNome(bo.getNome());
        bo.setValorPadrao(dto.getValorPadrao());

        return bo;
    }

}
