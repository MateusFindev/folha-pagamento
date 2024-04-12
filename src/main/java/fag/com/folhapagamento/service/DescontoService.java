package fag.com.folhapagamento.service;

import fag.com.folhapagamento.core.dtos.DescontoDTO;
import fag.com.folhapagamento.core.mappers.BeneficioMapper;
import fag.com.folhapagamento.core.mappers.DescontoMapper;
import fag.com.folhapagamento.core.usecases.desconto.BuscarDescontos;
import fag.com.folhapagamento.core.usecases.desconto.ListarDescontos;
import fag.com.folhapagamento.infra.jakarta.mappers.JakartaBeneficioMapper;
import fag.com.folhapagamento.infra.jakarta.mappers.JakartaDescontoMapper;
import fag.com.folhapagamento.infra.jakarta.models.JakartaDesconto;
import fag.com.folhapagamento.infra.jakarta.repositories.JakartaDescontoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DescontoService implements ListarDescontos, BuscarDescontos {

    private final JakartaDescontoRepository repository;

    @Autowired
    public DescontoService (JakartaDescontoRepository repository) {this.repository = repository;}

    @Override
    public List<DescontoDTO> listAll() {
        return this.repository.listAll();
    }

    @Override
    public Object customFindById(Long id) {
        JakartaDesconto desconto = this.repository.findById(id).orElse(null);

        if (desconto == null) {
            return null;
        }

        return DescontoMapper.toDTO(JakartaDescontoMapper.toDomain(desconto));
    }

    public JakartaDesconto findByCodigo(String codigo) {
        return this.repository.findByCodigo(codigo);
    }

}
