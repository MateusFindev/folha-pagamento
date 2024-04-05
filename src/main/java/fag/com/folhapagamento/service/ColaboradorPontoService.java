package fag.com.folhapagamento.service;

import fag.com.folhapagamento.infra.jakarta.repositories.JakartaColaboradorPontoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ColaboradorPontoService {

    private final JakartaColaboradorPontoRepository repository;

    @Autowired
    public ColaboradorPontoService(JakartaColaboradorPontoRepository repository) {
        this.repository = repository;
    }

}
