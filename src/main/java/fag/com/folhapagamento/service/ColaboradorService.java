package fag.com.folhapagamento.service;

import fag.com.folhapagamento.core.dtos.ColaboradorDTO;
import fag.com.folhapagamento.core.usecases.colaborador.ListarColaborador;
import fag.com.folhapagamento.infra.jakarta.repositories.JakartaColaboradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColaboradorService implements ListarColaborador {

    private final JakartaColaboradorRepository repository;

    @Autowired
    public ColaboradorService(JakartaColaboradorRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ColaboradorDTO> listAll() {
        return this.repository.listAll();
    }

}
