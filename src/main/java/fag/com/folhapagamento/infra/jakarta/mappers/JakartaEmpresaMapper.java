package fag.com.folhapagamento.infra.jakarta.mappers;

import fag.com.folhapagamento.core.entities.EmpresaBO;
import fag.com.folhapagamento.infra.jakarta.models.JakartaEmpresa;

public class JakartaEmpresaMapper {

    public static EmpresaBO toDomain(JakartaEmpresa entity) {
        EmpresaBO domain = new EmpresaBO();

        domain.setCnpj(entity.getCnpj());
        domain.setRazaoSocial(entity.getRazaoSocial());
        domain.setNomeFantasia(entity.getNomeFantasia());
        domain.setEndereco(entity.getEndereco());
        domain.setRegimeTributario(entity.getRegimeTributario());
        domain.setInscricaoEstadual(entity.getInscricaoEstadual());
        domain.setInscricaoMunicipal(entity.getInscricaoMunicipal());

        return domain;
    }

    public static JakartaEmpresa toEntity(EmpresaBO domain) {
        JakartaEmpresa entity = new JakartaEmpresa();

        entity.setCnpj(domain.getCnpj());
        entity.setRazaoSocial(domain.getRazaoSocial());
        entity.setNomeFantasia(domain.getNomeFantasia());
        entity.setEndereco(domain.getEndereco());
        entity.setRegimeTributario(domain.getRegimeTributario());
        entity.setInscricaoEstadual(domain.getInscricaoEstadual());
        entity.setInscricaoMunicipal(domain.getInscricaoMunicipal());

        return entity;
    }

}
