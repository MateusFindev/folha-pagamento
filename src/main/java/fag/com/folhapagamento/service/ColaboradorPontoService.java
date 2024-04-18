package fag.com.folhapagamento.service;

import fag.com.folhapagamento.core.dtos.ColaboradorPontoDTO;
import fag.com.folhapagamento.core.usecases.colaborador.ponto.BuscarColaboradorPonto;
import fag.com.folhapagamento.core.usecases.colaborador.ponto.ListarColaboradorPonto;
import fag.com.folhapagamento.infra.jakarta.repositories.JakartaColaboradorPontoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColaboradorPontoService implements BuscarColaboradorPonto, ListarColaboradorPonto {

    private final JakartaColaboradorPontoRepository repository;

    @Autowired
    public ColaboradorPontoService(JakartaColaboradorPontoRepository repository) {
        this.repository = repository;
    }

    @Override
    public ColaboradorPontoDTO customFindById(Long id) {
        return this.repository.customFindById(id);
    }

    @Override
    public List<ColaboradorPontoDTO> listAllByColaboradorId(Long colaboradorId) {
        return this.repository.listAllByColaboradorId(colaboradorId);
    }

    @Override
    public List<ColaboradorPontoDTO> listAll() {
        return this.repository.listAll();
    }
}
