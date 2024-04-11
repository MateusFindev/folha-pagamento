package fag.com.folhapagamento.infra.jakarta.mappers;

import fag.com.folhapagamento.core.entities.ColaboradorBO;
import fag.com.folhapagamento.core.mappers.DependenteMapper;
import fag.com.folhapagamento.infra.jakarta.models.JakartaColaborador;

public class JakartaColaboradorMapper {

    public static ColaboradorBO toDomain(JakartaColaborador entity) {
        ColaboradorBO domain = new ColaboradorBO();

        domain.setId(entity.getId());
        domain.setCpf(entity.getCpf());
        domain.setRg(entity.getRg());
        domain.setCnh(entity.getCnh());
        domain.setNome(entity.getNome());
        domain.setEmail(entity.getEmail());
        domain.setAdmissao(entity.getAdmissao());
        domain.setContrato(JakartaContratoMapper.toDomain(entity.getContrato()));
        domain.setGenero(entity.getGenero());
        domain.setDependentes(entity.getDependentes().stream().map(JakartaDependenteMapper::toDomain).toList());
        domain.setBeneficios(entity.getBeneficios().stream().map(JakartaColaboradorBeneficioMapper::toDomain).toList());
        domain.setDescontos(entity.getDescontos().stream().map(JakartaColaboradorDescontoMapper::toDomain).toList());

        return domain;
    }

    public static JakartaColaborador toEntity(ColaboradorBO domain) {
        JakartaColaborador entity = new JakartaColaborador();

        entity.setId(domain.getId());
        entity.setCpf(domain.getCpf());
        entity.setRg(domain.getRg());
        entity.setCnh(domain.getCnh());
        entity.setNome(domain.getNome());
        entity.setEmail(domain.getEmail());
        entity.setAdmissao(domain.getAdmissao());
        entity.setContrato(JakartaContratoMapper.toEntity(domain.getContrato()));
        entity.setGenero(domain.getGenero());
        entity.setDependentes(domain.getDependentes().stream().map(JakartaDependenteMapper::toEntity).toList());
        entity.setBeneficios(domain.getBeneficios().stream().map(JakartaColaboradorBeneficioMapper::toEntity).toList());
        entity.setDescontos(domain.getDescontos().stream().map(JakartaColaboradorDescontoMapper::toEntity).toList());

        return entity;
    }

}
