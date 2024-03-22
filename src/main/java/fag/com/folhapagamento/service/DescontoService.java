package fag.com.folhapagamento.service;

import fag.com.folhapagamento.infra.jakarta.repositories.JakartaDescontoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DescontoService {

    private final JakartaDescontoRepository repository;

    @Autowired
    public DescontoService (JakartaDescontoRepository repository) {this.repository = repository;}
}
