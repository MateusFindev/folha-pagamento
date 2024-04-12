package fag.com.folhapagamento.service;

import fag.com.folhapagamento.core.dtos.ColaboradorBeneficioDTO;
import fag.com.folhapagamento.core.dtos.ColaboradorDescontoDTO;
import fag.com.folhapagamento.core.entities.ColaboradorDescontoBO;
import fag.com.folhapagamento.core.mappers.ColaboradorDescontoMapper;
import fag.com.folhapagamento.core.usecases.colaborador.desconto.ListarColaboradorDesconto;
import fag.com.folhapagamento.infra.jakarta.repositories.JakartaColaboradorDescontoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ColaboradorDescontoService implements ListarColaboradorDesconto {

    private final JakartaColaboradorDescontoRepository repository;

    @Autowired
    public ColaboradorDescontoService(JakartaColaboradorDescontoRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ColaboradorDescontoDTO> listAll() {
        return this.repository.listAll();
    }

    @Override
    public List<ColaboradorDescontoDTO> listAllByColaboradorId(Long id) {
        return this.repository.listAllByColaboradorId(id);
    }

    @Transactional
    public ColaboradorDescontoDTO create(ColaboradorDescontoDTO dto) {
        if (dto.getValor() == null) {
            dto.setValor(BigDecimal.ZERO);
        }

        ColaboradorDescontoBO entity = this.repository.create(ColaboradorDescontoMapper.toBO(dto));

        return ColaboradorDescontoMapper.toDTO(entity);
    }

    @Transactional
    public ColaboradorDescontoDTO update(Long id, ColaboradorDescontoDTO dto) {
        ColaboradorDescontoBO entity = this.repository.update(id, ColaboradorDescontoMapper.toBO(dto));

        return ColaboradorDescontoMapper.toDTO(entity);
    }

}
