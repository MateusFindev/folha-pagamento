package fag.com.folhapagamento.service;

import fag.com.folhapagamento.core.dtos.DependenteDTO;
import fag.com.folhapagamento.core.usecases.dependente.BuscarDependente;
import fag.com.folhapagamento.core.usecases.dependente.ListarDependente;
import fag.com.folhapagamento.infra.jakarta.models.JakartaColaborador;
import fag.com.folhapagamento.infra.jakarta.repositories.JakartaDependenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DependenteService implements ListarDependente, BuscarDependente {

    private final JakartaDependenteRepository repository;

    @Autowired
    public DependenteService(JakartaDependenteRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<DependenteDTO> listAll() {
        return this.repository.listAll();
    }

    public List<DependenteDTO> listAllByColaborador(JakartaColaborador colaborador) {
        return this.repository.listAllByColaborador(colaborador);
    }

    @Override
    public DependenteDTO findByColaboradorIdAndId(Long colaboradorId, Long dependenteId) {
        return this.repository.findByColaboradorIdAndId(colaboradorId, dependenteId);
    }

    @Override
    public DependenteDTO customFindById(Long id) {
        return this.repository.customFindById(id);
    }

}
