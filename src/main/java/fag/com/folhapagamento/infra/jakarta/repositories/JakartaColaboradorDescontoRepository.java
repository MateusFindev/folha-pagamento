package fag.com.folhapagamento.infra.jakarta.repositories;

import fag.com.folhapagamento.core.dtos.ColaboradorDescontoDTO;
import fag.com.folhapagamento.core.mappers.ColaboradorDescontoMapper;
import fag.com.folhapagamento.core.usecases.colaborador.desconto.ListarColaboradorDesconto;
import fag.com.folhapagamento.infra.jakarta.mappers.JakartaColaboradorDescontoMapper;
import fag.com.folhapagamento.infra.jakarta.models.JakartaColaboradorDesconto;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JakartaColaboradorDescontoRepository extends SimpleJpaRepository<JakartaColaboradorDesconto,Long> implements ListarColaboradorDesconto {

    private final EntityManager em;

    @Autowired
    public JakartaColaboradorDescontoRepository(EntityManager em) {
        super(JakartaColaboradorDesconto.class, em);
        this.em = em;
    }

    @Override
    public List<ColaboradorDescontoDTO> listAll() {
        List<JakartaColaboradorDesconto> beneficios = this.findAll();

        return beneficios.stream().map(beneficio -> ColaboradorDescontoMapper.toDTO(JakartaColaboradorDescontoMapper.toDomain(beneficio))).toList();
    }
}
