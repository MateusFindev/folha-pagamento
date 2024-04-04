package fag.com.folhapagamento.core.mappers;

import fag.com.folhapagamento.core.dtos.FolhaPagamentoDTO;
import fag.com.folhapagamento.core.entities.FolhaPagamentoBO;

public class FolhaPagamentoMapper {

    public static FolhaPagamentoDTO toDTO(FolhaPagamentoBO bo) {
        FolhaPagamentoDTO dto = new FolhaPagamentoDTO();

        dto.setColaborador(ColaboradorMapper.toDTO(bo.getColaborador()));
        dto.setSalarioBruto(bo.getSalarioBruto());
        dto.setSalarioLiquido(bo.getSalarioLiquido());
        dto.setDescontos(bo.getDescontos().stream().map(ColaboradorDescontoMapper::toDTO).toList());
        dto.setMes(bo.getMes());
        dto.setDiasUteis(bo.getDiasUteis());

        return dto;
    }

    public static FolhaPagamentoBO toBO(FolhaPagamentoDTO dto) {
        FolhaPagamentoBO bo = new FolhaPagamentoBO();

        bo.setColaborador(ColaboradorMapper.toBO(dto.getColaborador()));
        bo.setSalarioBruto(dto.getSalarioBruto());
        bo.setSalarioLiquido(dto.getSalarioLiquido());
        bo.setDescontos(dto.getDescontos().stream().map(ColaboradorDescontoMapper::toBO).toList());
        bo.setMes(dto.getMes());
        bo.setDiasUteis(dto.getDiasUteis());

        return bo;
    }

}
