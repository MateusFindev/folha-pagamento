package fag.com.folhapagamento.infra.jakarta.repositories;

import fag.com.folhapagamento.core.dtos.DepartamentoDTO;
import fag.com.folhapagamento.core.mappers.DepartamentoMapper;
import fag.com.folhapagamento.core.usecases.departamento.ListarDepartamentos;
import fag.com.folhapagamento.infra.jakarta.mappers.JakartaDepartamentoMapper;
import fag.com.folhapagamento.infra.jakarta.models.JakartaDepartamento;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JakartaDepartamentoRepository extends SimpleJpaRepository<JakartaDepartamento, Long> implements ListarDepartamentos {

    private final EntityManager em;

    @Autowired
    JakartaDepartamentoRepository(EntityManager em) {
        super(JakartaDepartamento.class, em);
        this.em = em;
    }

    @Override
    public List<DepartamentoDTO> listAll() {
        List<JakartaDepartamento> departamentos = this.findAll();

        return departamentos.stream().map(departamento -> DepartamentoMapper.toDTO(JakartaDepartamentoMapper.toDomain(departamento))).toList();
    }

}
