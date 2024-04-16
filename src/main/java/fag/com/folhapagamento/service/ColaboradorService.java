package fag.com.folhapagamento.service;

import fag.com.folhapagamento.core.dtos.ColaboradorDTO;
import fag.com.folhapagamento.core.exceptions.colaborador.ColaboradorNaoEncontrado;
import fag.com.folhapagamento.core.mappers.ColaboradorMapper;
import fag.com.folhapagamento.core.usecases.colaborador.BuscarColaborador;
import fag.com.folhapagamento.core.usecases.colaborador.ListarColaborador;
import fag.com.folhapagamento.infra.jakarta.mappers.JakartaColaboradorMapper;
import fag.com.folhapagamento.infra.jakarta.models.JakartaColaborador;
import fag.com.folhapagamento.infra.jakarta.repositories.JakartaColaboradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColaboradorService implements ListarColaborador, BuscarColaborador {

    private final JakartaColaboradorRepository repository;

    @Autowired
    public ColaboradorService(JakartaColaboradorRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ColaboradorDTO> listAll() {
        return this.repository.listAll();
    }

    @Override
    public ColaboradorDTO customFindById(Long id) {
        JakartaColaborador colaborador = this.repository.findById(id).orElse(null);

        if (colaborador == null) {
            throw new ColaboradorNaoEncontrado("Não foi possível encontrar um colaborador para o ID informado", 400);
        }

        return ColaboradorMapper.toDTO(JakartaColaboradorMapper.toDomain(colaborador, true));
    }

}
