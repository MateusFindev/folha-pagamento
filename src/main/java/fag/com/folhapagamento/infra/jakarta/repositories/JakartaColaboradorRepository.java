package fag.com.folhapagamento.infra.jakarta.repositories;

import fag.com.folhapagamento.core.dtos.ColaboradorDTO;
import fag.com.folhapagamento.core.mappers.ColaboradorMapper;
import fag.com.folhapagamento.core.usecases.colaborador.ListarColaborador;
import fag.com.folhapagamento.infra.jakarta.mappers.JakartaColaboradorMapper;
import fag.com.folhapagamento.infra.jakarta.models.JakartaColaborador;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class JakartaColaboradorRepository extends SimpleJpaRepository<JakartaColaborador, Long> implements ListarColaborador {

    private final EntityManager em;

    @Autowired
    public JakartaColaboradorRepository(EntityManager em) {
        super(JakartaColaborador.class, em);
        this.em = em;
    }

    @Override
    public List<ColaboradorDTO> listAll() {
        List<JakartaColaborador> colaboradores = this.findAll();

        return colaboradores.stream().map(colaborador -> ColaboradorMapper.toDTO(JakartaColaboradorMapper.toDomain(colaborador))).collect(Collectors.toList());
    }

}
