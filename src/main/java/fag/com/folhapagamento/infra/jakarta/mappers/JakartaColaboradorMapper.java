package fag.com.folhapagamento.infra.jakarta.mappers;

import fag.com.folhapagamento.core.entities.ColaboradorBO;
import fag.com.folhapagamento.core.mappers.ContratoMapper;
import fag.com.folhapagamento.infra.jakarta.models.JakartaColaborador;

public class JakartaColaboradorMapper {

    public ColaboradorBO toDomain(JakartaColaborador entity) {
        ColaboradorBO domain = new ColaboradorBO();

        domain.setCpf(entity.getCpf());
        domain.setRg(entity.getRg());
        domain.setCnh(entity.getCnh());
        domain.setNome(entity.getNome());
        domain.setAdmissao(entity.getAdmissao());
        domain.setContrato(JakartaContratoMapper.toDomain(entity.getContrato()));
        domain.setDependentes(entity.getDependentes());

        return domain;
    }

    public JakartaColaborador toEntity(ColaboradorBO domain) {
        JakartaColaborador entity = new JakartaColaborador();

        entity.setCpf(domain.getCpf());
        entity.setRg(domain.getRg());
        entity.setCnh(domain.getCnh());
        entity.setNome(domain.getNome());
        entity.setAdmissao(domain.getAdmissao());
        entity.setContrato(JakartaContratoMapper.toEntity(domain.getContrato()));
        entity.setDependentes(domain.getDependentes());

        return entity;
    }

}
