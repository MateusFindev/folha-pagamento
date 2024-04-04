package fag.com.folhapagamento.infra.jakarta.repositories;

import fag.com.folhapagamento.core.dtos.ContratoDTO;
import fag.com.folhapagamento.core.mappers.ContratoMapper;
import fag.com.folhapagamento.core.usecases.contrato.BuscarContrato;
import fag.com.folhapagamento.infra.jakarta.mappers.JakartaContratoMapper;
import fag.com.folhapagamento.infra.jakarta.models.JakartaContrato;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

@Service
public class JakartaContratoRepository extends SimpleJpaRepository<JakartaContrato, Long> implements BuscarContrato {

    private final EntityManager em;

    @Autowired
    public JakartaContratoRepository(EntityManager em) {
        super(JakartaContrato.class, em);
        this.em = em;
    }

    @Override
    public ContratoDTO customFindById(Long id) {
        return null;
    }

    @Override
    public ContratoDTO findByColaboradorId(Long id) {
        TypedQuery<JakartaContrato> query = em.createQuery("SELECT e FROM JakartaContrato e WHERE e.colaborador.id = :id", JakartaContrato.class)
                .setParameter("id", id);

        try {
            return ContratoMapper.toDTO(JakartaContratoMapper.toDomain(query.getSingleResult()));
        } catch (NoResultException e) {
            return null;
        }
    }

}
