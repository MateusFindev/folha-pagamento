package fag.com.folhapagamento.core.mappers;

import fag.com.folhapagamento.core.dtos.BeneficioDTO;
import fag.com.folhapagamento.core.dtos.DescontoDTO;
import fag.com.folhapagamento.core.entities.BeneficioBO;
import fag.com.folhapagamento.core.entities.DescontoBO;

public class BeneficioMapper {
    public static BeneficioDTO toDTO(BeneficioBO bo) {
        BeneficioDTO dto = new BeneficioDTO();

        dto.setId(bo.getId());
        dto.setCodigo(bo.getCodigo());
        dto.setDescricao(bo.getDescricao());
        dto.setAtivo(bo.isAtivo());
        dto.setNome(bo.getNome());
        dto.setTipoValor(bo.getTipoValor());
        dto.setPrazo(bo.getPrazo());
        dto.setTipoBeneficio(bo.getTipoBeneficio());
        dto.setValorPadrao(bo.getValorPadrao());

        return dto;
    }

    public static BeneficioBO toBO(BeneficioDTO dto) {
        BeneficioBO bo = new BeneficioBO();

        bo.setId(dto.getId());
        bo.setCodigo(dto.getCodigo());
        bo.setDescricao(dto.getDescricao());
        bo.setAtivo(dto.isAtivo());
        bo.setNome(bo.getNome());
        bo.setTipoValor(dto.getTipoValor());
        dto.setPrazo(bo.getPrazo());
        bo.setTipoBeneficio(dto.getTipoBeneficio());
        bo.setValorPadrao(dto.getValorPadrao());

        return bo;
    }

}
