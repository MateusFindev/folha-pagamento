package fag.com.folhapagamento.service;

import fag.com.folhapagamento.infra.jakarta.repositories.JakartaContratoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContratoService {

    private final JakartaContratoRepository repository;

    @Autowired
    public ContratoService(JakartaContratoRepository repository) {
        this.repository = repository;
    }

}
