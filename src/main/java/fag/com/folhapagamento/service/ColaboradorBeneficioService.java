package fag.com.folhapagamento.service;

import fag.com.folhapagamento.core.dtos.ColaboradorBeneficioDTO;
import fag.com.folhapagamento.core.entities.ColaboradorBeneficioBO;
import fag.com.folhapagamento.core.mappers.ColaboradorBeneficioMapper;
import fag.com.folhapagamento.core.usecases.colaborador.beneficio.BuscarColaboradorBeneficio;
import fag.com.folhapagamento.core.usecases.colaborador.beneficio.ListarColaboradorBeneficio;
import fag.com.folhapagamento.infra.jakarta.repositories.JakartaColaboradorBeneficioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColaboradorBeneficioService implements ListarColaboradorBeneficio, BuscarColaboradorBeneficio {

    private final JakartaColaboradorBeneficioRepository repository;

    @Autowired
    public ColaboradorBeneficioService(JakartaColaboradorBeneficioRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ColaboradorBeneficioDTO> listAll() {
        return this.repository.listAll();
    }

    @Override
    public List<ColaboradorBeneficioDTO> listAllByColaboradorId(Long id) {
        return this.repository.listAllByColaboradorId(id);
    }

    @Transactional
    public ColaboradorBeneficioDTO create(ColaboradorBeneficioDTO dto) {
        ColaboradorBeneficioBO entity = this.repository.create(ColaboradorBeneficioMapper.toBO(dto));

        return ColaboradorBeneficioMapper.toDTO(entity);
    }

    @Transactional
    public ColaboradorBeneficioDTO update(Long id, ColaboradorBeneficioDTO dto) {
        ColaboradorBeneficioBO entity = this.repository.update(id, ColaboradorBeneficioMapper.toBO(dto));

        return ColaboradorBeneficioMapper.toDTO(entity);
    }

    @Override
    public ColaboradorBeneficioDTO findByColaboradorIdAndId(Long colaboradorId, Long beneficioId) {
        return this.repository.findByColaboradorIdAndId(colaboradorId, beneficioId);
    }

    @Override
    public ColaboradorBeneficioDTO customFindById(Long id) {
        return this.repository.customFindById(id);
    }

}