package fag.com.folhapagamento.infra.jakarta.mappers;

import fag.com.folhapagamento.core.entities.ContratoBO;
import fag.com.folhapagamento.infra.jakarta.models.JakartaContrato;

public class JakartaContratoMapper {

    public static ContratoBO toDomain(JakartaContrato entity) {
        ContratoBO domain = new ContratoBO();

        domain.setTipo(entity.getTipo());
        domain.setCargaHoraria(entity.getCargaHoraria());
        domain.setTipoFiliacao(entity.getTipoFiliacao());
        domain.setCargo(JakartaCargoMapper.toDomain(entity.getCargo()));
        domain.setEmpresa(JakartaEmpresaMapper.toDomain(entity.getEmpresa()));

        return domain;
    }

    public static JakartaContrato toEntity(ContratoBO domain) {
        JakartaContrato entity = new JakartaContrato();

        entity.setTipo(domain.getTipo());
        entity.setCargaHoraria(domain.getCargaHoraria());
        entity.setTipoFiliacao(domain.getTipoFiliacao());
        entity.setCargo(JakartaCargoMapper.toEntity(domain.getCargo()));
        entity.setEmpresa(JakartaEmpresaMapper.toEntity(domain.getEmpresa()));

        return entity;
    }

}
