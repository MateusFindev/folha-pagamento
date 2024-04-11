package fag.com.folhapagamento.infra.jakarta.mappers;

import fag.com.folhapagamento.core.entities.ColaboradorBeneficioBO;
import fag.com.folhapagamento.infra.jakarta.models.JakartaColaboradorBeneficio;

public class JakartaColaboradorBeneficioMapper {

    public static ColaboradorBeneficioBO toDomain(JakartaColaboradorBeneficio entity) {
        ColaboradorBeneficioBO domain = new ColaboradorBeneficioBO();

        domain.setId(entity.getId());
        domain.setColaborador(JakartaColaboradorMapper.toDomain(entity.getColaborador()));
        domain.setBeneficio(JakartaBeneficioMapper.toDomain(entity.getBeneficio()));
        domain.setValor(entity.getValor());
        domain.setUsarPadrao(entity.isUsarPadrao());
        domain.setAtivo(entity.isAtivo());

        return domain;
    }

    public static JakartaColaboradorBeneficio toEntity(ColaboradorBeneficioBO domain) {
        JakartaColaboradorBeneficio entity = new JakartaColaboradorBeneficio();

        entity.setId(domain.getId());
        entity.setColaborador(JakartaColaboradorMapper.toEntity(domain.getColaborador()));
        entity.setBeneficio(JakartaBeneficioMapper.toEntity(domain.getBeneficio()));
        entity.setValor(domain.getValor());
        entity.setUsarPadrao(domain.isUsarPadrao());
        entity.setAtivo(domain.isAtivo());

        return entity;
    }

}
