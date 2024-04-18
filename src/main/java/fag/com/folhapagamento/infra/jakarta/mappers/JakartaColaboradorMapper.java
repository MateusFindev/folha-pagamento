package fag.com.folhapagamento.infra.jakarta.mappers;

import fag.com.folhapagamento.core.entities.ColaboradorBO;
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
            if (entity.getDependentes() != null && !entity.getDependentes().isEmpty()) {
                domain.setDependentes(entity.getDependentes().stream().map(JakartaDependenteMapper::toDomain).collect(Collectors.toList()));
            }

            if (entity.getBeneficios() != null && !entity.getBeneficios().isEmpty()) {
                domain.setBeneficios(entity.getBeneficios().stream().map(beneficio -> JakartaColaboradorBeneficioMapper.toDomain(beneficio, false)).collect(Collectors.toList()));
            }

            if (entity.getDescontos() != null && !entity.getDescontos().isEmpty()) {
                domain.setDescontos(entity.getDescontos().stream().map(desconto -> JakartaColaboradorDescontoMapper.toDomain(desconto, false)).collect(Collectors.toList()));
            }

            if (entity.getPontos() != null && !entity.getPontos().isEmpty()) {
                domain.setPontos(entity.getPontos().stream().map(ponto -> JakartaColaboradorPontoMapper.toDomain(ponto, false)).collect(Collectors.toList()));
            }
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
            if (domain.getDependentes() != null && !domain.getDependentes().isEmpty()) {
                entity.setDependentes(domain.getDependentes().stream().map(JakartaDependenteMapper::toEntity).collect(Collectors.toList()));
            }

            if (domain.getBeneficios() != null && !domain.getBeneficios().isEmpty()) {
                entity.setBeneficios(domain.getBeneficios().stream().map(beneficio -> JakartaColaboradorBeneficioMapper.toEntity(beneficio, false)).collect(Collectors.toList()));
            }

            if (domain.getDescontos() != null && !domain.getDescontos().isEmpty()) {
                entity.setDescontos(domain.getDescontos().stream().map(desconto -> JakartaColaboradorDescontoMapper.toEntity(desconto, false)).collect(Collectors.toList()));
            }

            if (domain.getPontos() != null && !domain.getPontos().isEmpty()) {
                entity.setPontos(domain.getPontos().stream().map(ponto -> JakartaColaboradorPontoMapper.toEntity(ponto, false)).collect(Collectors.toList()));
            }
        }

        return entity;
    }

}
