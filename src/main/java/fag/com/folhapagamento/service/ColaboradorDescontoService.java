package fag.com.folhapagamento.service;

import fag.com.folhapagamento.core.dtos.ColaboradorDescontoDTO;
import fag.com.folhapagamento.core.usecases.colaborador.desconto.ListarColaboradorDesconto;
import fag.com.folhapagamento.infra.jakarta.repositories.JakartaColaboradorDescontoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColaboradorDescontoService implements ListarColaboradorDesconto {

    private final JakartaColaboradorDescontoRepository repository;

    @Autowired
    public ColaboradorDescontoService(JakartaColaboradorDescontoRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ColaboradorDescontoDTO> listAll() {
        return this.repository.listAll();
    }

    @Override
    public List<ColaboradorDescontoDTO> listAllByColaboradorId(Long id) {
        return this.repository.listAllByColaboradorId(id);
    }

}
