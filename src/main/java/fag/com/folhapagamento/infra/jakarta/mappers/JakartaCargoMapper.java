package fag.com.folhapagamento.infra.jakarta.mappers;

import fag.com.folhapagamento.core.entities.CargoBO;
import fag.com.folhapagamento.infra.jakarta.models.JakartaCargo;

public class JakartaCargoMapper {

    public static CargoBO toDomain(JakartaCargo entity) {
        CargoBO domain = new CargoBO();

        domain.setId(entity.getId());
        domain.setNome(entity.getNome());
        domain.setDescricao(entity.getDescricao());
        domain.setNivel(entity.getNivel());
        domain.setFuncao(entity.getFuncao());
        domain.setSalarioBase(entity.getSalarioBase());
        domain.setAdPericulosidade(entity.isAdPericulosidade());
        domain.setAdInsalubridade(entity.isAdInsalubridade());
        domain.setAdFuncao(entity.isAdFuncao());
        domain.setComissao(entity.isComissao());

        return domain;
    }

    public static JakartaCargo toEntity(CargoBO domain) {
        JakartaCargo entity = new JakartaCargo();

        entity.setId(domain.getId());
        entity.setNome(domain.getNome());
        entity.setDescricao(domain.getDescricao());
        entity.setNivel(domain.getNivel());
        entity.setFuncao(domain.getFuncao());
        entity.setSalarioBase(domain.getSalarioBase());
        entity.setAdPericulosidade(domain.isAdPericulosidade());
        entity.setAdInsalubridade(domain.isAdInsalubridade());
        entity.setAdFuncao(domain.isAdFuncao());
        entity.setComissao(domain.isComissao());

        return entity;
    }

}
