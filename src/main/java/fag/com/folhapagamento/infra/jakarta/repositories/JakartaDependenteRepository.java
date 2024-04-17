package fag.com.folhapagamento.infra.jakarta.repositories;

import fag.com.folhapagamento.core.dtos.DependenteDTO;
import fag.com.folhapagamento.core.mappers.DependenteMapper;
import fag.com.folhapagamento.core.usecases.dependente.BuscarDependente;
import fag.com.folhapagamento.core.usecases.dependente.ListarDependente;
import fag.com.folhapagamento.infra.jakarta.mappers.JakartaDependenteMapper;
import fag.com.folhapagamento.infra.jakarta.models.JakartaDependente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class JakartaDependenteRepository extends SimpleJpaRepository<JakartaDependente, Long> implements ListarDependente, BuscarDependente {

    private final EntityManager em;

    @Autowired
    JakartaDependenteRepository(EntityManager em) {
        super(JakartaDependente.class, em);
        this.em = em;
    }

    @Override
    public List<DependenteDTO> listAll() {
        List<JakartaDependente> dependentes = this.findAll();

        return dependentes.stream().map(dependente -> DependenteMapper.toDTO(JakartaDependenteMapper.toDomain(dependente))).collect(Collectors.toList());
    }

    @Override
    public DependenteDTO findByColaboradorIdAndId(Long colaboradorId, Long dependenteId) {
        TypedQuery<JakartaDependente> query = em.createQuery("SELECT e FROM JakartaDependente e WHERE e.id = :dependenteId AND e.colaborador.id = :colaborador", JakartaDependente.class)
                .setParameter("dependenteId", dependenteId)
                .setParameter("colaborador", colaboradorId);

        try {
            return DependenteMapper.toDTO(JakartaDependenteMapper.toDomain(query.getSingleResult()));
        } catch (NoResultException e) {
            return null;
        }
    }

    @Override
    public DependenteDTO customFindById(Long id) {
        JakartaDependente dependente = this.findById(id).orElse(null);

        if (dependente == null) {
            return null;
        }

        return DependenteMapper.toDTO(JakartaDependenteMapper.toDomain(dependente));
    }

}