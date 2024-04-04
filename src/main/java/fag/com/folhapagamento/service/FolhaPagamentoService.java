package fag.com.folhapagamento.service;

import fag.com.folhapagamento.infra.jakarta.repositories.JakartaFolhaPagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FolhaPagamentoService {

    private final JakartaFolhaPagamentoRepository repository;

    @Autowired
    public FolhaPagamentoService(JakartaFolhaPagamentoRepository repository) {
        this.repository = repository;
    }

}
