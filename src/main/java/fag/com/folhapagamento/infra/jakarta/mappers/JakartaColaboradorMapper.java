package fag.com.folhapagamento.infra.jakarta.mappers;

import fag.com.folhapagamento.core.entities.ColaboradorBO;
import fag.com.folhapagamento.core.mappers.DependenteMapper;
import fag.com.folhapagamento.infra.jakarta.models.JakartaColaborador;

import java.util.stream.Collectors;

public class JakartaColaboradorMapper {

    public static ColaboradorBO toDomain(JakartaColaborador entity) {
        return toDomain(entity, true);
    }

    public static ColaboradorBO toDomain(JakartaColaborador entity, boolean includeAll) {
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

        if (includeAll) {
            domain.setDependentes(entity.getDependentes().stream().map(dependente -> JakartaDependenteMapper.toDomain(dependente)).collect(Collectors.toList()));
            domain.setBeneficios(entity.getBeneficios().stream().map(beneficio -> JakartaColaboradorBeneficioMapper.toDomain(beneficio)).collect(Collectors.toList()));
            domain.setDescontos(entity.getDescontos().stream().map(desconto -> JakartaColaboradorDescontoMapper.toDomain(desconto)).collect(Collectors.toList()));
        }

        return domain;
    }

    public static JakartaColaborador toEntity(ColaboradorBO domain) {
        return toEntity(domain, true);
    }

    public static JakartaColaborador toEntity(ColaboradorBO domain, boolean includeAll) {
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

        if (includeAll) {
            entity.setDependentes(domain.getDependentes().stream().map(dependente -> JakartaDependenteMapper.toEntity(dependente, false)).collect(Collectors.toList()));
            entity.setBeneficios(domain.getBeneficios().stream().map(beneficio -> JakartaColaboradorBeneficioMapper.toEntity(beneficio, false)).collect(Collectors.toList()));
            entity.setDescontos(domain.getDescontos().stream().map(desconto -> JakartaColaboradorDescontoMapper.toEntity(desconto, false)).collect(Collectors.toList()));
        }

        return entity;
    }

}
