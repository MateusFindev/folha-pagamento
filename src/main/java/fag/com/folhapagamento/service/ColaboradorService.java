package fag.com.folhapagamento.service;

import fag.com.folhapagamento.infra.jakarta.repositories.JakartaColaboradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ColaboradorService {

    public JakartaColaboradorRepository repository;

    @Autowired
    public ColaboradorService(JakartaColaboradorRepository repository) {
        this.repository = repository;
    }

}
