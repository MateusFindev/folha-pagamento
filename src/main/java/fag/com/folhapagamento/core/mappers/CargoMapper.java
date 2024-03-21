package fag.com.folhapagamento.core.mappers;

import fag.com.folhapagamento.core.dtos.CargoDTO;
import fag.com.folhapagamento.core.entities.CargoBO;

public class CargoMapper {

    public static CargoDTO toDTO(CargoBO bo) {
        CargoDTO dto = new CargoDTO();

        dto.setNome(bo.getNome());
        dto.setDescricao(bo.getDescricao());
        dto.setNivel(bo.getNivel());
        dto.setFuncao(bo.getFuncao());
        dto.setSalarioBase(bo.getSalarioBase());
        dto.setAdPericulosidade(bo.isAdPericulosidade());
        dto.setAdInsalubridade(bo.isAdInsalubridade());
        dto.setAdFuncao(bo.isAdFuncao());
        dto.setComissao(bo.isComissao());

        return dto;
    }

    public static CargoBO toBO(CargoDTO dto) {
        CargoBO bo = new CargoBO();

        bo.setNome(dto.getNome());
        bo.setDescricao(dto.getDescricao());
        bo.setNivel(dto.getNivel());
        bo.setFuncao(dto.getFuncao());
        bo.setSalarioBase(dto.getSalarioBase());
        bo.setAdPericulosidade(dto.isAdPericulosidade());
        bo.setAdInsalubridade(dto.isAdInsalubridade());
        bo.setAdFuncao(dto.isAdFuncao());
        bo.setComissao(dto.isComissao());

        return bo;
    }

}
