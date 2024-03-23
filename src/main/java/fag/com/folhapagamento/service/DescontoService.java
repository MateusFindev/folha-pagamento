package fag.com.folhapagamento.service;

import fag.com.folhapagamento.core.dtos.DescontoDTO;
import fag.com.folhapagamento.core.usecases.desconto.ListarDescontos;
import fag.com.folhapagamento.infra.jakarta.repositories.JakartaDescontoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DescontoService implements ListarDescontos {

    private final JakartaDescontoRepository repository;

    @Autowired
    public DescontoService (JakartaDescontoRepository repository) {this.repository = repository;}

    @Override
    public List<DescontoDTO> listAll() {
        return this.repository.listAll();
    }

}
