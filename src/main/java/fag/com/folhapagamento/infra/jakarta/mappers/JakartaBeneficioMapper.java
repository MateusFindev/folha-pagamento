package fag.com.folhapagamento.infra.jakarta.mappers;

import fag.com.folhapagamento.core.entities.BeneficioBO;
import fag.com.folhapagamento.infra.jakarta.models.JakartaBeneficio;

public class JakartaBeneficioMapper {

    public static BeneficioBO toDomain(JakartaBeneficio entity) {
        BeneficioBO domain = new BeneficioBO();

        domain.setId(entity.getId());
        domain.setCodigo(entity.getCodigo());
        domain.setNome(entity.getNome());
        domain.setDescricao(entity.getDescricao());
        domain.setValorPadrao(entity.getValorPadrao());
        domain.setTipoValor(entity.getTipoValor());
        domain.setPrazo(entity.getPrazo());
        domain.setTipoBeneficio(entity.getTipoBeneficio());
        domain.setAtivo(entity.isAtivo());

        return domain;
    }

    public static JakartaBeneficio toEntity(BeneficioBO domain) {
        JakartaBeneficio entity = new JakartaBeneficio();

        entity.setId(domain.getId());
        entity.setCodigo(domain.getCodigo());
        entity.setNome(domain.getNome());
        entity.setDescricao(domain.getDescricao());
        entity.setValorPadrao(domain.getValorPadrao());
        entity.setTipoValor(domain.getTipoValor());
        entity.setPrazo(domain.getPrazo());
        entity.setTipoBeneficio(domain.getTipoBeneficio());
        entity.setAtivo(domain.isAtivo());

        return entity;
    }

}
