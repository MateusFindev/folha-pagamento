package fag.com.folhapagamento.infra.jakarta.mappers;

import fag.com.folhapagamento.core.entities.DependenteBO;
import fag.com.folhapagamento.infra.jakarta.models.JakartaDependente;

public class JakartaDependenteMapper {

    public static DependenteBO toDomain(JakartaDependente entity) {
        DependenteBO domain = new DependenteBO();

        domain.setNome(entity.getNome());
        domain.setNascimento(entity.getNascimento());
        domain.setParentesco(entity.getParentesco());
        domain.setColaborador(JakartaColaboradorMapper.toDomain(entity.getColaborador()));

        return domain;
    }

    public static JakartaDependente toEntity(DependenteBO domain) {
        JakartaDependente entity = new JakartaDependente();

        entity.setNome(domain.getNome());
        entity.setNascimento(domain.getNascimento());
        entity.setParentesco(domain.getParentesco());
        entity.setColaborador(JakartaColaboradorMapper.toEntity(domain.getColaborador()));

        return entity;
    }
}
