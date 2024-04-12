package fag.com.folhapagamento.infra.jakarta.repositories;

import fag.com.folhapagamento.core.dtos.DependenteDTO;
import fag.com.folhapagamento.core.mappers.DependenteMapper;
import fag.com.folhapagamento.core.usecases.dependente.ListarDependentes;
import fag.com.folhapagamento.infra.jakarta.mappers.JakartaDependenteMapper;
import fag.com.folhapagamento.infra.jakarta.models.JakartaColaborador;
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
public class JakartaDependenteRepository extends SimpleJpaRepository<JakartaDependente, Long> implements ListarDependentes {

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

    public List<DependenteDTO> listAllByColaborador(JakartaColaborador colaborador) {
        TypedQuery<JakartaDependente> query = em.createQuery("SELECT e FROM JakartaDependente e WHERE e.colaborador = :colaborador", JakartaDependente.class)
                .setParameter("colaborador", colaborador);

        try {
            List<JakartaDependente> dependentes = query.getResultList();

            if (dependentes.isEmpty()) {
                return null;
            }

            return dependentes.stream().map(dependente -> DependenteMapper.toDTO(JakartaDependenteMapper.toDomain(dependente))).collect(Collectors.toList());
        } catch (NoResultException e) {
            return null;
        }
    }

}