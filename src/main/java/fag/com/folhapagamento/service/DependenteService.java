package fag.com.folhapagamento.service;

import fag.com.folhapagamento.core.dtos.DependenteDTO;
import fag.com.folhapagamento.core.usecases.dependente.ListarDependentes;
import fag.com.folhapagamento.infra.jakarta.repositories.JakartaDependenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DependenteService implements ListarDependentes {

    private final JakartaDependenteRepository repository;

    @Autowired
    public DependenteService(JakartaDependenteRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<DependenteDTO> listAll() {
        return this.repository.listAll();
    }

}
