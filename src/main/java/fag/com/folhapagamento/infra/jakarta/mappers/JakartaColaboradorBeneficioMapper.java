package fag.com.folhapagamento.infra.jakarta.mappers;

import fag.com.folhapagamento.core.entities.ColaboradorBeneficioBO;
import fag.com.folhapagamento.infra.jakarta.models.JakartaColaboradorBeneficio;

public class JakartaColaboradorBeneficioMapper {

    public static ColaboradorBeneficioBO toDomain(JakartaColaboradorBeneficio entity) {
        return toDomain(entity, true);
    }

    public static ColaboradorBeneficioBO toDomain(JakartaColaboradorBeneficio entity, boolean includeAll) {
        ColaboradorBeneficioBO domain = new ColaboradorBeneficioBO();

        domain.setId(entity.getId());
        domain.setBeneficio(JakartaBeneficioMapper.toDomain(entity.getBeneficio()));
        domain.setValor(entity.getValor());
        domain.setUsarPadrao(entity.isUsarPadrao());
        domain.setAtivo(entity.isAtivo());

        if (includeAll) {
            domain.setColaborador(JakartaColaboradorMapper.toDomain(entity.getColaborador(), false));
        }

        return domain;
    }

    public static JakartaColaboradorBeneficio toEntity(ColaboradorBeneficioBO domain) {
        return toEntity(domain, true);
    }

    public static JakartaColaboradorBeneficio toEntity(ColaboradorBeneficioBO domain, boolean includeAll) {
        JakartaColaboradorBeneficio entity = new JakartaColaboradorBeneficio();

        entity.setId(domain.getId());
        entity.setBeneficio(JakartaBeneficioMapper.toEntity(domain.getBeneficio()));
        entity.setValor(domain.getValor());
        entity.setUsarPadrao(domain.isUsarPadrao());
        entity.setAtivo(domain.isAtivo());

        if (includeAll) {
            entity.setColaborador(JakartaColaboradorMapper.toEntity(domain.getColaborador(), false));
        }

        return entity;
    }

}
