package fag.com.folhapagamento.service;

import fag.com.folhapagamento.core.dtos.BeneficioDTO;
import fag.com.folhapagamento.core.usecases.beneficio.ListarBeneficios;
import fag.com.folhapagamento.infra.jakarta.repositories.JakartaBeneficioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeneficioService implements ListarBeneficios {
    private final JakartaBeneficioRepository repository;

    @Autowired
    public BeneficioService (JakartaBeneficioRepository repository) {this.repository = repository;}

    @Override
    public List<BeneficioDTO> listAll() {
        return this.repository.listAll();
    }
}
