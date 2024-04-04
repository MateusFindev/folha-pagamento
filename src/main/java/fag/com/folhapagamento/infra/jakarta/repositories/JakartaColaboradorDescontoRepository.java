package fag.com.folhapagamento.infra.jakarta.repositories;

import fag.com.folhapagamento.core.dtos.ColaboradorDescontoDTO;
import fag.com.folhapagamento.core.mappers.ColaboradorDescontoMapper;
import fag.com.folhapagamento.core.usecases.colaborador.desconto.ListarColaboradorDesconto;
import fag.com.folhapagamento.infra.jakarta.mappers.JakartaColaboradorDescontoMapper;
import fag.com.folhapagamento.infra.jakarta.models.JakartaColaboradorDesconto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;
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
        List<JakartaColaboradorDesconto> colaboradorDescontos = this.findAll();

        return colaboradorDescontos.stream().map(colaboradorDesconto -> ColaboradorDescontoMapper.toDTO(JakartaColaboradorDescontoMapper.toDomain(colaboradorDesconto))).toList();
    }

    @Override
    public List<ColaboradorDescontoDTO> listAllByColaboradorId(Long id) {
        TypedQuery<JakartaColaboradorDesconto> query = em.createQuery("SELECT e FROM JakartaColaboradorDesconto e WHERE e.colaborador.id = :id", JakartaColaboradorDesconto.class)
                .setParameter("id", id);

        try {
            return query.getResultList().stream().map(colaboradorDesconto -> ColaboradorDescontoMapper.toDTO(JakartaColaboradorDescontoMapper.toDomain(colaboradorDesconto))).toList();
        } catch (NoResultException e) {
            return null;
        }
    }

}
