package fag.com.folhapagamento.infra.jakarta.mappers;

import fag.com.folhapagamento.core.entities.DependenteBO;
import fag.com.folhapagamento.infra.jakarta.models.JakartaDependente;

public class JakartaDependenteMapper {

    public static DependenteBO toDomain(JakartaDependente entity) {
        return toDomain(entity, true);
    }

    public static DependenteBO toDomain(JakartaDependente entity, boolean includeAll) {
        DependenteBO domain = new DependenteBO();

        domain.setId(entity.getId());
        domain.setNome(entity.getNome());
        domain.setNascimento(entity.getNascimento());
        domain.setParentesco(entity.getParentesco());

        if (includeAll) {
            domain.setColaborador(JakartaColaboradorMapper.toDomain(entity.getColaborador(), false));
        }

        return domain;
    }

    public static JakartaDependente toEntity(DependenteBO domain) {
        return toEntity(domain, true);
    }

    public static JakartaDependente toEntity(DependenteBO domain, boolean includeAll) {
        JakartaDependente entity = new JakartaDependente();

        entity.setId(domain.getId());
        entity.setNome(domain.getNome());
        entity.setNascimento(domain.getNascimento());
        entity.setParentesco(domain.getParentesco());

        if (includeAll) {
            entity.setColaborador(JakartaColaboradorMapper.toEntity(domain.getColaborador()));
        }

        return entity;
    }

}
