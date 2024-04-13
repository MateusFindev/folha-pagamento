package fag.com.folhapagamento.infra.jakarta.mappers;

import fag.com.folhapagamento.core.entities.FolhaPagamentoBO;
import fag.com.folhapagamento.infra.jakarta.models.JakartaFolhaPagamento;

import java.util.stream.Collectors;

public class JakartaFolhaPagamentoMapper {

    public static FolhaPagamentoBO toDomain(JakartaFolhaPagamento entity) {
        return toDomain(entity, true);
    }

    public static FolhaPagamentoBO toDomain(JakartaFolhaPagamento entity, boolean includeAll) {
        FolhaPagamentoBO domain = new FolhaPagamentoBO();

        domain.setId(entity.getId());
        domain.setSalarioBruto(entity.getSalarioBruto());
        domain.setSalarioLiquido(entity.getSalarioLiquido());
        domain.setMes(entity.getMes());
        domain.setDiasUteis(entity.getDiasUteis());

        if (includeAll) {
            domain.setColaborador(JakartaColaboradorMapper.toDomain(entity.getColaborador()));
        }

        return domain;
    }

    public static JakartaFolhaPagamento toEntity(FolhaPagamentoBO domain) {
        return toEntity(domain, true);
    }

    public static JakartaFolhaPagamento toEntity(FolhaPagamentoBO domain, boolean includeAll) {
        JakartaFolhaPagamento entity = new JakartaFolhaPagamento();

        entity.setId(domain.getId());
        entity.setSalarioBruto(domain.getSalarioBruto());
        entity.setSalarioLiquido(domain.getSalarioLiquido());
        entity.setMes(domain.getMes());
        entity.setDiasUteis(domain.getDiasUteis());

        if (includeAll) {
            entity.setColaborador(JakartaColaboradorMapper.toEntity(domain.getColaborador()));
        }

        return entity;
    }

}
