package fag.com.folhapagamento.service;

import fag.com.folhapagamento.core.dtos.DepartamentoDTO;
import fag.com.folhapagamento.core.repositories.IDepartamentoRepository;
import fag.com.folhapagamento.core.usecases.departamento.ListarDepartamentos;
import fag.com.folhapagamento.infra.jakarta.repositories.JakartaDepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartamentoService implements IDepartamentoRepository {

    private final JakartaDepartamentoRepository repository;

    @Autowired
    public DepartamentoService(JakartaDepartamentoRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<DepartamentoDTO> listAll() {
        ListarDepartamentos listarDepartamentos = new ListarDepartamentos(this.repository);

        return listarDepartamentos.execute();
    }

}
