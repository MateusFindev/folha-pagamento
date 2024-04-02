package fag.com.folhapagamento.infra.jakarta.mappers;

import fag.com.folhapagamento.core.entities.DepartamentoBO;
import fag.com.folhapagamento.infra.jakarta.models.JakartaDepartamento;

public class JakartaDepartamentoMapper {

    public static DepartamentoBO toDomain(JakartaDepartamento entity) {
        DepartamentoBO domain = new DepartamentoBO();

        domain.setNome(entity.getNome());
        domain.setDescricao(entity.getDescricao());
        domain.setAtivo(entity.isAtivo());
        domain.setEmpresa(JakartaEmpresaMapper.toDomain(entity.getEmpresa()));

        return domain;
    }

    public static JakartaDepartamento toEntity(DepartamentoBO domain) {
        JakartaDepartamento entity = new JakartaDepartamento();

        entity.setNome(domain.getNome());
        entity.setDescricao(domain.getDescricao());
        entity.setAtivo(domain.isAtivo());
        entity.setEmpresa(JakartaEmpresaMapper.toEntity(domain.getEmpresa()));

        return entity;
    }

}
