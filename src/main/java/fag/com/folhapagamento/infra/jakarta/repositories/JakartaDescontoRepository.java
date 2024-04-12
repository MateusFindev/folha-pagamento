package fag.com.folhapagamento.infra.jakarta.repositories;

import fag.com.folhapagamento.core.dtos.DescontoDTO;
import fag.com.folhapagamento.core.mappers.DescontoMapper;
import fag.com.folhapagamento.core.usecases.desconto.ListarDescontos;
import fag.com.folhapagamento.infra.jakarta.mappers.JakartaDescontoMapper;
import fag.com.folhapagamento.infra.jakarta.models.JakartaDesconto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JakartaDescontoRepository extends SimpleJpaRepository<JakartaDesconto, Long> implements ListarDescontos {

    private final EntityManager em;

    @Autowired
    public JakartaDescontoRepository(EntityManager em) {
        super(JakartaDesconto.class, em);
        this.em = em;
    }

    @Override
    public List<DescontoDTO> listAll() {
        List<JakartaDesconto> descontos = this.findAll();

        if (descontos.isEmpty()) {
            return null;
        }

        return descontos.stream().map(desconto -> DescontoMapper.toDTO(JakartaDescontoMapper.toDomain(desconto))).toList();
    }

    public JakartaDesconto findByCodigo(String codigo) {
        TypedQuery<JakartaDesconto> query = em.createQuery("SELECT e FROM JakartaBeneficio e WHERE e.codigo = :codigo", JakartaDesconto.class)
                .setParameter("codigo", codigo);

        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

}
