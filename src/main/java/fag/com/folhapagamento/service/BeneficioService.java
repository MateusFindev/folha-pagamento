package fag.com.folhapagamento.service;

import fag.com.folhapagamento.infra.jakarta.models.JakartaBeneficio;
import fag.com.folhapagamento.infra.jakarta.repositories.JakartaBeneficioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BeneficioService {
    private final JakartaBeneficioRepository repository;

    @Autowired
    public BeneficioService (JakartaBeneficioRepository repository) {this.repository = repository;}
}
