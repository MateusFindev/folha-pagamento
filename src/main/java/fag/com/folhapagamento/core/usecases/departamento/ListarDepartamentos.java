package fag.com.folhapagamento.core.usecases.departamento;

import fag.com.folhapagamento.core.dtos.DepartamentoDTO;
import fag.com.folhapagamento.core.repositories.IDepartamentoRepository;

import java.util.List;

public class ListarDepartamentos {

    private final IDepartamentoRepository repository;

    public ListarDepartamentos(IDepartamentoRepository repository) {
        this.repository = repository;
    }

    public List<DepartamentoDTO> execute() {
        return this.repository.listAll();
    }

}
