package fag.com.folhapagamento.infra.jakarta.mappers;

import fag.com.folhapagamento.core.entities.ColaboradorPontoBO;
import fag.com.folhapagamento.infra.jakarta.models.JakartaColaboradorPonto;

public class JakartaColaboradorPontoMapper {

    public static ColaboradorPontoBO toDomain(JakartaColaboradorPonto entity) {
        ColaboradorPontoBO domain = new ColaboradorPontoBO();

        domain.setColaborador(JakartaColaboradorMapper.toDomain(entity.getColaborador()));
        domain.setDiasTrabalhados(entity.getDiasTrabalhados());
        domain.setFaltas(entity.getFaltas());
        domain.setHorasAtraso(entity.getHorasAtraso());
        domain.setHoras50(entity.getHoras50());
        domain.setHoras100(entity.getHoras100());
        domain.setMes(entity.getMes());

        return domain;
    }

    public static JakartaColaboradorPonto toEntity(ColaboradorPontoBO domain) {
        JakartaColaboradorPonto entity = new JakartaColaboradorPonto();

        entity.setColaborador(JakartaColaboradorMapper.toEntity(domain.getColaborador()));
        entity.setDiasTrabalhados(domain.getDiasTrabalhados());
        entity.setFaltas(domain.getFaltas());
        entity.setHorasAtraso(domain.getHorasAtraso());
        entity.setHoras50(domain.getHoras50());
        entity.setHoras100(domain.getHoras100());
        entity.setMes(domain.getMes());

        return entity;
    }

}
