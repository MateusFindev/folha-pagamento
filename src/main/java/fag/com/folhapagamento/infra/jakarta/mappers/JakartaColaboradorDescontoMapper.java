package fag.com.folhapagamento.infra.jakarta.mappers;

import fag.com.folhapagamento.core.entities.ColaboradorDescontoBO;
import fag.com.folhapagamento.infra.jakarta.models.JakartaColaboradorDesconto;

public class JakartaColaboradorDescontoMapper {

    public static ColaboradorDescontoBO toDomain(JakartaColaboradorDesconto entity) {
        return toDomain(entity, true);
    }

    public static ColaboradorDescontoBO toDomain(JakartaColaboradorDesconto entity, boolean includeAll) {
        ColaboradorDescontoBO domain = new ColaboradorDescontoBO();

        domain.setId(entity.getId());
        domain.setDesconto(JakartaDescontoMapper.toDomain(entity.getDesconto()));
        domain.setValor(entity.getValor());
        domain.setAtivo(entity.isAtivo());

        if (includeAll) {
            domain.setColaborador(JakartaColaboradorMapper.toDomain(entity.getColaborador(), false));
        }

        return domain;
    }

    public static JakartaColaboradorDesconto toEntity(ColaboradorDescontoBO domain) {
        return toEntity(domain, true);
    }

    public static JakartaColaboradorDesconto toEntity(ColaboradorDescontoBO domain, boolean includeAll) {
        JakartaColaboradorDesconto entity = new JakartaColaboradorDesconto();

        entity.setId(domain.getId());
        entity.setDesconto(JakartaDescontoMapper.toEntity(domain.getDesconto()));
        entity.setValor(domain.getValor());
        entity.setAtivo(domain.isAtivo());

        if (includeAll) {
            entity.setColaborador(JakartaColaboradorMapper.toEntity(domain.getColaborador(), false));
        }

        return entity;
    }

}
