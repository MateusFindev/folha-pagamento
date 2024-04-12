package fag.com.folhapagamento.infra.jakarta.mappers;

import fag.com.folhapagamento.core.entities.FolhaPagamentoBO;
import fag.com.folhapagamento.infra.jakarta.models.JakartaFolhaPagamento;

import java.util.stream.Collectors;

public class JakartaFolhaPagamentoMapper {

    public static FolhaPagamentoBO toDomain(JakartaFolhaPagamento entity) {
        FolhaPagamentoBO domain = new FolhaPagamentoBO();

        domain.setId(entity.getId());
        domain.setColaborador(JakartaColaboradorMapper.toDomain(entity.getColaborador()));
        domain.setSalarioBruto(entity.getSalarioBruto());
        domain.setSalarioLiquido(entity.getSalarioLiquido());
        domain.setDescontos(entity.getColaboradorDescontos().stream().map(JakartaColaboradorDescontoMapper::toDomain).collect(Collectors.toList()));
        domain.setMes(entity.getMes());
        domain.setDiasUteis(entity.getDiasUteis());

        return domain;
    }

    public static JakartaFolhaPagamento toEntity(FolhaPagamentoBO domain) {
        JakartaFolhaPagamento entity = new JakartaFolhaPagamento();

        entity.setId(domain.getId());
        entity.setColaborador(JakartaColaboradorMapper.toEntity(domain.getColaborador()));
        entity.setSalarioBruto(domain.getSalarioBruto());
        entity.setSalarioLiquido(domain.getSalarioLiquido());
        entity.setColaboradorDescontos(domain.getDescontos().stream().map(JakartaColaboradorDescontoMapper::toEntity).collect(Collectors.toList()));
        entity.setMes(domain.getMes());
        entity.setDiasUteis(domain.getDiasUteis());

        return entity;
    }

}
