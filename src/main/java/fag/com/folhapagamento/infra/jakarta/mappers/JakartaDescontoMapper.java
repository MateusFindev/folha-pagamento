package fag.com.folhapagamento.infra.jakarta.mappers;

import fag.com.folhapagamento.core.entities.DescontoBO;
import fag.com.folhapagamento.infra.jakarta.models.JakartaDesconto;
import fag.com.folhapagamento.infra.jakarta.models.JakartaEmpresa;

public class JakartaDescontoMapper {

    public static DescontoBO toDomain(JakartaDesconto entity) {
        DescontoBO domain = new DescontoBO();

        domain.setNome(entity.getNome());
        domain.setDescricao(entity.getDescricao());
        domain.setAtivo(entity.isAtivo());
        domain.setCodigo(entity.getCodigo());

        return domain;
    }

    public static JakartaDesconto toEntity(DescontoBO domain) {
        JakartaDesconto entity = new JakartaDesconto();

        entity.setAtivo(domain.isAtivo());
        entity.setCodigo(domain.getCodigo());
        entity.setNome(domain.getNome());
        entity.setDescricao(domain.getDescricao());

        return entity;
    }
}
