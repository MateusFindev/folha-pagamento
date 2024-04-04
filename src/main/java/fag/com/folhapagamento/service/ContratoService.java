package fag.com.folhapagamento.service;

import fag.com.folhapagamento.core.dtos.ContratoDTO;
import fag.com.folhapagamento.core.usecases.contrato.BuscarContrato;
import fag.com.folhapagamento.infra.jakarta.repositories.JakartaContratoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContratoService implements BuscarContrato {

    private final JakartaContratoRepository repository;

    @Autowired
    public ContratoService(JakartaContratoRepository repository) {
        this.repository = repository;
    }

    @Override
    public ContratoDTO customFindById(Long id) {
        return this.repository.customFindById(id);
    }

    @Override
    public ContratoDTO findByColaboradorId(Long id) {
        return this.repository.findByColaboradorId(id);
    }

}
