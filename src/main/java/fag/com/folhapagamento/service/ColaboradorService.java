package fag.com.folhapagamento.service;

import fag.com.folhapagamento.core.dtos.BeneficioDTO;
import fag.com.folhapagamento.core.dtos.ColaboradorDTO;
import fag.com.folhapagamento.core.dtos.DescontoDTO;
import fag.com.folhapagamento.core.entities.ColaboradorBO;
import fag.com.folhapagamento.core.entities.ColaboradorBeneficioBO;
import fag.com.folhapagamento.core.entities.ColaboradorDescontoBO;
import fag.com.folhapagamento.core.exceptions.beneficio.BeneficioNotFoundException;
import fag.com.folhapagamento.core.exceptions.colaborador.ColaboradorNotFoundException;
import fag.com.folhapagamento.core.exceptions.desconto.DescontoNotFoundException;
import fag.com.folhapagamento.core.mappers.ColaboradorMapper;
import fag.com.folhapagamento.core.usecases.colaborador.BuscarColaborador;
import fag.com.folhapagamento.core.usecases.colaborador.ListarColaborador;
import fag.com.folhapagamento.infra.jakarta.mappers.*;
import fag.com.folhapagamento.infra.jakarta.models.JakartaBeneficio;
import fag.com.folhapagamento.infra.jakarta.models.JakartaColaborador;
import fag.com.folhapagamento.infra.jakarta.models.JakartaDesconto;
import fag.com.folhapagamento.infra.jakarta.repositories.JakartaColaboradorRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColaboradorService implements ListarColaborador, BuscarColaborador {

    private final JakartaColaboradorRepository repository;

    private final BeneficioService beneficioService;

    private final DescontoService descontoService;

    @Autowired
    public ColaboradorService(JakartaColaboradorRepository repository, BeneficioService beneficioService, DescontoService descontoService) {
        this.repository = repository;
        this.beneficioService = beneficioService;
        this.descontoService = descontoService;
    }

    @Override
    public List<ColaboradorDTO> listAll() {
        return this.repository.listAll();
    }

    @Override
    public ColaboradorDTO customFindById(Long id) {
        JakartaColaborador colaborador = this.repository.findById(id).orElse(null);

        if (colaborador == null) {
            return null;
        }

        return ColaboradorMapper.toDTO(JakartaColaboradorMapper.toDomain(colaborador));
    }

    @Transactional
    public ColaboradorDTO adicionarBeneficio(Long id, BeneficioDTO dto) {
        JakartaColaborador colaborador = this.repository.findById(id).orElse(null);

        if (colaborador == null) {
            throw new ColaboradorNotFoundException();
        }

        JakartaBeneficio beneficio = this.beneficioService.findByCodigo(dto.getCodigo());

        if (beneficio == null) {
            throw new BeneficioNotFoundException();
        }

        ColaboradorBO colaboradorBO = JakartaColaboradorMapper.toDomain(colaborador);
        ColaboradorBeneficioBO colaboradorBeneficio = colaboradorBO.adicionarBeneficio(JakartaBeneficioMapper.toDomain(beneficio));

        colaborador.adicionarBeneficio(JakartaColaboradorBeneficioMapper.toEntity(colaboradorBeneficio));

        return this.repository.update(colaborador);
    }

    @Transactional
    public ColaboradorDTO adicionarDesconto(Long id, DescontoDTO dto) {
        JakartaColaborador colaborador = this.repository.findById(id).orElse(null);

        if (colaborador == null) {
            throw new ColaboradorNotFoundException();
        }

        JakartaDesconto desconto = this.descontoService.findByCodigo(dto.getCodigo());

        if (desconto == null) {
            throw new DescontoNotFoundException();
        }

        ColaboradorBO colaboradorBO = JakartaColaboradorMapper.toDomain(colaborador);
        ColaboradorDescontoBO colaboradorDesconto = colaboradorBO.adicionarDesconto(JakartaDescontoMapper.toDomain(desconto));

        colaborador.adicionarDesconto(JakartaColaboradorDescontoMapper.toEntity(colaboradorDesconto));

        return this.repository.update(colaborador);
    }

}
