package fag.com.folhapagamento.core.mappers;

import fag.com.folhapagamento.core.dtos.ColaboradorDTO;
import fag.com.folhapagamento.core.entities.ColaboradorBO;

public class ColaboradorMapper {

    public static ColaboradorDTO toDTO(ColaboradorBO bo) {
        return toDTO(bo, true);
    }

    public static ColaboradorDTO toDTO(ColaboradorBO bo, boolean includeAll) {
        ColaboradorDTO dto = new ColaboradorDTO();

        dto.setId(bo.getId());
        dto.setCpf(bo.getCpf());
        dto.setRg(bo.getRg());
        dto.setCnh(bo.getCnh());
        dto.setNome(bo.getNome());
        dto.setEmail(bo.getEmail());
        dto.setAdmissao(bo.getAdmissao());
        dto.setContrato(ContratoMapper.toDTO(bo.getContrato()));
        dto.setGenero(bo.getGenero());

        if (includeAll) {
            if (bo.getDependentes() != null && !bo.getDependentes().isEmpty()) {
                dto.setDependentes(bo.getDependentes().stream().map(DependenteMapper::toDTO).toList());
            }

            if (bo.getBeneficios() != null && !bo.getBeneficios().isEmpty()) {
                dto.setBeneficios(bo.getBeneficios().stream().map(ColaboradorBeneficioMapper::toDTO).toList());
            }

            if (bo.getDescontos() != null && !bo.getDescontos().isEmpty()) {
                dto.setDescontos(bo.getDescontos().stream().map(ColaboradorDescontoMapper::toDTO).toList());
            }
        }

        return dto;
    }

    public static ColaboradorBO toBO(ColaboradorDTO dto) {
        return toBO(dto, true);
    }

    public static ColaboradorBO toBO(ColaboradorDTO dto, boolean includeAll) {
        ColaboradorBO bo = new ColaboradorBO();

        bo.setId(dto.getId());
        bo.setCpf(dto.getCpf());
        bo.setRg(dto.getRg());
        bo.setCnh(dto.getCnh());
        bo.setNome(dto.getNome());
        bo.setEmail(dto.getEmail());
        bo.setAdmissao(dto.getAdmissao());
        bo.setContrato(ContratoMapper.toBO(dto.getContrato()));
        bo.setGenero(dto.getGenero());

        if (includeAll) {
            if (dto.getDependentes() != null && !dto.getDependentes().isEmpty()) {
                bo.setBeneficios(dto.getBeneficios().stream().map(ColaboradorBeneficioMapper::toBO).toList());
            }

            if (dto.getBeneficios() != null && !dto.getBeneficios().isEmpty()) {
                bo.setDependentes(dto.getDependentes().stream().map(DependenteMapper::toBO).toList());
            }

            if (dto.getDescontos() != null && !dto.getDescontos().isEmpty()) {
                bo.setDescontos(dto.getDescontos().stream().map(ColaboradorDescontoMapper::toBO).toList());
            }
        }

        return bo;
    }

}
