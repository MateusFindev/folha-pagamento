package fag.com.folhapagamento.core.mappers;

import fag.com.folhapagamento.core.dtos.EmpresaDTO;
import fag.com.folhapagamento.core.entities.EmpresaBO;

public class EmpresaMapper {

    public static EmpresaDTO toDTO(EmpresaBO bo) {
        EmpresaDTO dto = new EmpresaDTO();

        dto.setCnpj(bo.getCnpj());
        dto.setRazaoSocial(bo.getRazaoSocial());
        dto.setNomeFantasia(bo.getNomeFantasia());
        dto.setEndereco(bo.getEndereco());
        dto.setRegimeTributario(bo.getRegimeTributario());
        dto.setInscricaoEstadual(bo.getInscricaoEstadual());
        dto.setInscricaoMunicipal(bo.getInscricaoMunicipal());

        return dto;
    }

    public static EmpresaBO toDTO(EmpresaDTO dto) {
        EmpresaBO bo = new EmpresaBO();

        bo.setCnpj(dto.getCnpj());
        bo.setRazaoSocial(dto.getRazaoSocial());
        bo.setNomeFantasia(dto.getNomeFantasia());
        bo.setEndereco(dto.getEndereco());
        bo.setRegimeTributario(dto.getRegimeTributario());
        bo.setInscricaoEstadual(dto.getInscricaoEstadual());
        bo.setInscricaoMunicipal(dto.getInscricaoMunicipal());

        return bo;
    }

}
