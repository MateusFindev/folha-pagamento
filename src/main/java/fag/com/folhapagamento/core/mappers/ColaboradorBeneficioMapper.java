package fag.com.folhapagamento.core.mappers;

import fag.com.folhapagamento.core.dtos.ColaboradorBeneficioDTO;
import fag.com.folhapagamento.core.entities.ColaboradorBeneficioBO;

public class ColaboradorBeneficioMapper {

    public static ColaboradorBeneficioDTO toDTO(ColaboradorBeneficioBO bo) {
        ColaboradorBeneficioDTO dto = new ColaboradorBeneficioDTO();

        dto.setId(bo.getId());
        dto.setColaborador(ColaboradorMapper.toDTO(bo.getColaborador()));
        dto.setBeneficio(BeneficioMapper.toDTO(bo.getBeneficio()));
        dto.setValor(bo.getValor());
        dto.setUsarPadrao(bo.isUsarPadrao());
        dto.setAtivo(bo.isAtivo());

        return dto;
    }

    public static ColaboradorBeneficioBO toBO(ColaboradorBeneficioDTO dto) {
        ColaboradorBeneficioBO bo = new ColaboradorBeneficioBO();

        bo.setId(dto.getId());
        bo.setColaborador(ColaboradorMapper.toBO(dto.getColaborador()));
        bo.setBeneficio(BeneficioMapper.toBO(dto.getBeneficio()));
        bo.setValor(dto.getValor());
        bo.setUsarPadrao(dto.isUsarPadrao());
        bo.setAtivo(dto.isAtivo());

        return bo;
    }

}
