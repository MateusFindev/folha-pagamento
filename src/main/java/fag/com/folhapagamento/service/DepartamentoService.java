package fag.com.folhapagamento.service;

import fag.com.folhapagamento.core.dtos.CargoDTO;
import fag.com.folhapagamento.core.dtos.DepartamentoDTO;
import fag.com.folhapagamento.core.usecases.departamento.ListarDepartamentos;
import fag.com.folhapagamento.infra.jakarta.repositories.JakartaDepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartamentoService implements ListarDepartamentos {

    private final JakartaDepartamentoRepository repository;

    @Autowired
    public DepartamentoService(JakartaDepartamentoRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<DepartamentoDTO> listAll() {
        return this.repository.listAll();
    }

    @Override
    public List<CargoDTO> listAllCargos(Long id) {
        return this.repository.listAllCargos(id);
    }

}
