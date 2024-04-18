package fag.com.folhapagamento.infra.jakarta.mappers;

import fag.com.folhapagamento.core.entities.ColaboradorPontoBO;
import fag.com.folhapagamento.infra.jakarta.models.JakartaColaboradorPonto;

public class JakartaColaboradorPontoMapper {

    public static ColaboradorPontoBO toDomain(JakartaColaboradorPonto entity) {
        return toDomain(entity, true);
    }

    public static ColaboradorPontoBO toDomain(JakartaColaboradorPonto entity, boolean includeAll) {
        ColaboradorPontoBO domain = new ColaboradorPontoBO();

        domain.setId(entity.getId());
        domain.setDiasTrabalhados(entity.getDiasTrabalhados());
        domain.setFaltas(entity.getFaltas());
        domain.setHorasAtraso(entity.getHorasAtraso());
        domain.setHoras50(entity.getHoras50());
        domain.setHoras100(entity.getHoras100());
        domain.setMes(entity.getMes());

        if (includeAll) {
            domain.setColaborador(JakartaColaboradorMapper.toDomain(entity.getColaborador()));
        }

        return domain;
    }

    public static JakartaColaboradorPonto toEntity(ColaboradorPontoBO domain) {
        return toEntity(domain, true);
    }

    public static JakartaColaboradorPonto toEntity(ColaboradorPontoBO domain, boolean includeAll) {
        JakartaColaboradorPonto entity = new JakartaColaboradorPonto();

        entity.setId(domain.getId());
        entity.setDiasTrabalhados(domain.getDiasTrabalhados());
        entity.setFaltas(domain.getFaltas());
        entity.setHorasAtraso(domain.getHorasAtraso());
        entity.setHoras50(domain.getHoras50());
        entity.setHoras100(domain.getHoras100());
        entity.setMes(domain.getMes());

        if (includeAll) {
            entity.setColaborador(JakartaColaboradorMapper.toEntity(domain.getColaborador()));
        }

        return entity;
    }

}
