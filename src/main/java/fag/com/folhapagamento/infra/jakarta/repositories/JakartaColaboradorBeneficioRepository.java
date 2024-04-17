package fag.com.folhapagamento.infra.jakarta.repositories;

import fag.com.folhapagamento.core.dtos.ColaboradorBeneficioDTO;
import fag.com.folhapagamento.core.entities.ColaboradorBeneficioBO;
import fag.com.folhapagamento.core.exceptions.colaborador.beneficio.ColaboradorBeneficioNaoEncontado;
import fag.com.folhapagamento.core.mappers.ColaboradorBeneficioMapper;
import fag.com.folhapagamento.core.usecases.colaborador.beneficio.AtualizarColaboradorBeneficio;
import fag.com.folhapagamento.core.usecases.colaborador.beneficio.BuscarColaboradorBeneficio;
import fag.com.folhapagamento.core.usecases.colaborador.beneficio.CriarColaboradorBeneficio;
import fag.com.folhapagamento.core.usecases.colaborador.beneficio.ListarColaboradorBeneficio;
import fag.com.folhapagamento.infra.jakarta.mappers.JakartaColaboradorBeneficioMapper;
import fag.com.folhapagamento.infra.jakarta.mappers.JakartaColaboradorMapper;
import fag.com.folhapagamento.infra.jakarta.models.JakartaColaboradorBeneficio;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class JakartaColaboradorBeneficioRepository extends SimpleJpaRepository<JakartaColaboradorBeneficio, Long> implements ListarColaboradorBeneficio, CriarColaboradorBeneficio, AtualizarColaboradorBeneficio, BuscarColaboradorBeneficio {

    private final EntityManager em;

    @Autowired
    public JakartaColaboradorBeneficioRepository(EntityManager em) {
        super(JakartaColaboradorBeneficio.class, em);
        this.em = em;
    }

    @Override
    public List<ColaboradorBeneficioDTO> listAll() {
        List<JakartaColaboradorBeneficio> colaboradorBeneficios = this.findAll();

        return colaboradorBeneficios.stream().map(colaboradorBeneficio -> ColaboradorBeneficioMapper.toDTO(JakartaColaboradorBeneficioMapper.toDomain(colaboradorBeneficio))).collect(Collectors.toList());
    }

    @Override
    public List<ColaboradorBeneficioDTO> listAllByColaboradorId(Long id) {
        TypedQuery<JakartaColaboradorBeneficio> query = em.createQuery("SELECT e FROM JakartaColaboradorBeneficio e WHERE e.colaborador.id = :id", JakartaColaboradorBeneficio.class)
                .setParameter("id", id);

        try {
            return query.getResultList().stream().map(beneficio -> ColaboradorBeneficioMapper.toDTO(JakartaColaboradorBeneficioMapper.toDomain(beneficio))).collect(Collectors.toList());
        } catch (NoResultException e) {
            return null;
        }
    }

    @Override
    public ColaboradorBeneficioBO create(ColaboradorBeneficioBO bo) {
        JakartaColaboradorBeneficio entity = JakartaColaboradorBeneficioMapper.toEntity(bo);
        entity.setColaborador(JakartaColaboradorMapper.toEntity(bo.getColaborador(), true));

        em.persist(entity);
        em.flush();

        return JakartaColaboradorBeneficioMapper.toDomain(entity);
    }

    @Override
    public ColaboradorBeneficioBO update(Long id, ColaboradorBeneficioBO bo) {
        JakartaColaboradorBeneficio colaboradorBeneficio = this.findById(id).orElse(null);

        if (colaboradorBeneficio == null) {
            throw new ColaboradorBeneficioNaoEncontado("Não foi possível encontrar esse benefício para o colaborador", 400);
        }

        JakartaColaboradorBeneficio entity = JakartaColaboradorBeneficioMapper.toEntity(bo);
        entity.setId(colaboradorBeneficio.getId());

        this.em.merge(entity);

        return JakartaColaboradorBeneficioMapper.toDomain(entity);
    }

    @Override
    public ColaboradorBeneficioDTO findByColaboradorIdAndId(Long colaboradorId, Long beneficioId) {
        TypedQuery<JakartaColaboradorBeneficio> query = em.createQuery("SELECT e FROM JakartaColaboradorBeneficio e WHERE e.id = :beneficio AND e.colaborador.id = :colaborador", JakartaColaboradorBeneficio.class)
                .setParameter("beneficio", beneficioId)
                .setParameter("colaborador", colaboradorId);

        try {
            return ColaboradorBeneficioMapper.toDTO(JakartaColaboradorBeneficioMapper.toDomain(query.getSingleResult()));
        } catch (NoResultException e) {
            return null;
        }
    }

    @Override
    public ColaboradorBeneficioDTO customFindById(Long id) {
        JakartaColaboradorBeneficio beneficio = this.findById(id).orElse(null);

        if (beneficio == null) {
            return null;
        }

        return ColaboradorBeneficioMapper.toDTO(JakartaColaboradorBeneficioMapper.toDomain(beneficio));
    }

}
