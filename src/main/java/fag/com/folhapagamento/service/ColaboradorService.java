package fag.com.folhapagamento.service;

import fag.com.folhapagamento.core.dtos.*;
import fag.com.folhapagamento.core.entities.*;
import fag.com.folhapagamento.core.exceptions.beneficio.BeneficioNaoEncontrado;
import fag.com.folhapagamento.core.exceptions.colaborador.ColaboradorJaPossuiBeneficio;
import fag.com.folhapagamento.core.exceptions.colaborador.ColaboradorJaPossuiDesconto;
import fag.com.folhapagamento.core.exceptions.colaborador.ColaboradorNaoEncontrado;
import fag.com.folhapagamento.core.exceptions.desconto.DescontoNaoEncontrado;
import fag.com.folhapagamento.core.mappers.ColaboradorBeneficioMapper;
import fag.com.folhapagamento.core.mappers.ColaboradorDescontoMapper;
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

    private final ColaboradorBeneficioService colaboradorBeneficioService;

    private final ColaboradorDescontoService colaboradorDescontoService;

    @Autowired
    public ColaboradorService(JakartaColaboradorRepository repository, BeneficioService beneficioService, DescontoService descontoService, ColaboradorBeneficioService colaboradorBeneficioService, ColaboradorDescontoService colaboradorDescontoService) {
        this.repository = repository;
        this.beneficioService = beneficioService;
        this.descontoService = descontoService;
        this.colaboradorBeneficioService = colaboradorBeneficioService;
        this.colaboradorDescontoService = colaboradorDescontoService;
    }

    @Override
    public List<ColaboradorDTO> listAll() {
        return this.repository.listAll();
    }

    @Override
    public ColaboradorDTO customFindById(Long id) {
        JakartaColaborador colaborador = this.repository.findById(id).orElse(null);

        if (colaborador == null) {
            throw new ColaboradorNaoEncontrado("Não foi possível encontrar um colaborador para o ID informado", 400);
        }

        return ColaboradorMapper.toDTO(JakartaColaboradorMapper.toDomain(colaborador, true));
    }

    @Transactional
    public ColaboradorDTO adicionarBeneficio(Long id, BeneficioDTO dto) {
        JakartaColaborador colaborador = this.repository.findById(id).orElse(null);

        if (colaborador == null) {
            throw new ColaboradorNaoEncontrado("Não foi possível encontrar o colaborador", 400);
        }

        JakartaBeneficio beneficio = this.beneficioService.findByCodigo(dto.getCodigo())
                .orElseThrow(BeneficioNaoEncontrado::new);

        ColaboradorBO colaboradorBO = JakartaColaboradorMapper.toDomain(colaborador);
        BeneficioBO beneficioBO = JakartaBeneficioMapper.toDomain(beneficio);

        ColaboradorBeneficioBO colaboradorBeneficio = colaboradorBO.adicionarBeneficio(beneficioBO);

        if (colaboradorBeneficio == null) {
            throw new ColaboradorJaPossuiBeneficio("O colaborador já possui esse benefício aplicado", 400);
        }

        colaboradorBeneficio.setColaborador(colaboradorBO);

        ColaboradorBeneficioDTO colaboradorBeneficioDTO = colaboradorBeneficioService.create(ColaboradorBeneficioMapper.toDTO(colaboradorBeneficio));

        colaboradorBO.getBeneficios().add(ColaboradorBeneficioMapper.toBO(colaboradorBeneficioDTO));

        return ColaboradorMapper.toDTO(colaboradorBO);
    }

    @Transactional
    public ColaboradorDTO adicionarDesconto(Long id, DescontoDTO dto) {
        JakartaColaborador colaborador = this.repository.findById(id).orElse(null);

        if (colaborador == null) {
            throw new ColaboradorNaoEncontrado("Não foi possível encontrar o colaborador", 400);
        }

        JakartaDesconto desconto = this.descontoService.findByCodigo(dto.getCodigo())
                .orElseThrow(DescontoNaoEncontrado::new);

        ColaboradorBO colaboradorBO = JakartaColaboradorMapper.toDomain(colaborador);
        DescontoBO descontoBO = JakartaDescontoMapper.toDomain(desconto);

        ColaboradorDescontoBO colaboradorDesconto = colaboradorBO.adicionarDesconto(descontoBO);

        if (colaboradorDesconto == null) {
            throw new ColaboradorJaPossuiDesconto("O colaborador já possui esse desconto aplicado", 400);
        }

        colaboradorDesconto.setColaborador(colaboradorBO);

        ColaboradorDescontoDTO colaboradorBeneficioDTO = colaboradorDescontoService.create(ColaboradorDescontoMapper.toDTO(colaboradorDesconto));

        colaboradorBO.getDescontos().add(ColaboradorDescontoMapper.toBO(colaboradorBeneficioDTO));

        return ColaboradorMapper.toDTO(colaboradorBO);
    }

}
