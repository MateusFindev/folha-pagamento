package fag.com.folhapagamento.service;

import fag.com.folhapagamento.core.dtos.ColaboradorPontoDTO;
import fag.com.folhapagamento.core.usecases.colaborador.ponto.BuscarColaboradorPonto;
import fag.com.folhapagamento.infra.jakarta.repositories.JakartaColaboradorPontoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ColaboradorPontoService implements BuscarColaboradorPonto {

    private final JakartaColaboradorPontoRepository repository;

    @Autowired
    public ColaboradorPontoService(JakartaColaboradorPontoRepository repository) {
        this.repository = repository;
    }

    public ColaboradorPontoDTO findByColaboradorId(Long colaboradorId) {
        return this.repository.findByColaboradorId(colaboradorId);
    }

    @Override
    public ColaboradorPontoDTO customFindById(Long id) {
        return this.repository.customFindById(id);
    }

}
