package fag.com.folhapagamento.infra.jakarta.mappers;

import fag.com.folhapagamento.core.entities.ColaboradorDescontoBO;
import fag.com.folhapagamento.core.mappers.DescontoMapper;
import fag.com.folhapagamento.infra.jakarta.models.JakartaColaboradorDesconto;

public class JakartaColaboradorDescontoMapper {

    public static ColaboradorDescontoBO toDomain(JakartaColaboradorDesconto entity) {
        ColaboradorDescontoBO domain = new ColaboradorDescontoBO();

        domain.setColaborador(JakartaColaboradorMapper.toDomain(entity.getColaborador()));
        domain.setDesconto(JakartaDescontoMapper.toDomain(entity.getDesconto()));
        domain.setValor(entity.getValor());
        domain.setAtivo(entity.isAtivo());

        return domain;
    }

    public static JakartaColaboradorDesconto toEntity(ColaboradorDescontoBO domain) {
        JakartaColaboradorDesconto entity = new JakartaColaboradorDesconto();

        entity.setColaborador(JakartaColaboradorMapper.toEntity(domain.getColaborador()));
        entity.setDesconto(JakartaDescontoMapper.toEntity(domain.getDesconto()));
        entity.setValor(domain.getValor());
        entity.setAtivo(domain.isAtivo());

        return entity;
    }

}
