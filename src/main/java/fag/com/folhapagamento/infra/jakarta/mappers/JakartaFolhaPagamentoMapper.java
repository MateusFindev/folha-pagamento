package fag.com.folhapagamento.infra.jakarta.mappers;

import fag.com.folhapagamento.core.entities.FolhaPagamentoBO;
import fag.com.folhapagamento.infra.jakarta.models.JakartaFolhaPagamento;

public class JakartaFolhaPagamentoMapper {

    public static FolhaPagamentoBO toDomain(JakartaFolhaPagamento entity) {
        FolhaPagamentoBO domain = new FolhaPagamentoBO();

        domain.setColaborador(JakartaColaboradorMapper.toDomain(entity.getColaborador()));
        domain.setSalarioBruto(entity.getSalarioBruto());
        domain.setSalarioLiquido(entity.getSalarioLiquido());
        domain.setDescontos(entity.getColaboradorDescontos().stream().map(JakartaColaboradorDescontoMapper::toDomain).toList());
        domain.setMes(entity.getMes());
        domain.setDiasUteis(entity.getDiasUteis());

        return domain;
    }

    public static JakartaFolhaPagamento toEntity(FolhaPagamentoBO domain) {
        JakartaFolhaPagamento entity = new JakartaFolhaPagamento();

        entity.setColaborador(JakartaColaboradorMapper.toEntity(domain.getColaborador()));
        entity.setSalarioBruto(domain.getSalarioBruto());
        entity.setSalarioLiquido(domain.getSalarioLiquido());
        entity.setColaboradorDescontos(domain.getDescontos().stream().map(JakartaColaboradorDescontoMapper::toEntity).toList());
        entity.setMes(domain.getMes());
        entity.setDiasUteis(domain.getDiasUteis());

        return entity;
    }

}
