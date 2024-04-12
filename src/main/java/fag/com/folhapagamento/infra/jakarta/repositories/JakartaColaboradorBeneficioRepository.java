package fag.com.folhapagamento.infra.jakarta.repositories;

import fag.com.folhapagamento.core.dtos.ColaboradorBeneficioDTO;
import fag.com.folhapagamento.core.entities.ColaboradorBeneficioBO;
import fag.com.folhapagamento.core.exceptions.colaborador.beneficio.ColaboradorBeneficioNaoEncontado;
import fag.com.folhapagamento.core.mappers.ColaboradorBeneficioMapper;
import fag.com.folhapagamento.core.usecases.colaborador.beneficio.AtualizarColaboradorBeneficio;
import fag.com.folhapagamento.core.usecases.colaborador.beneficio.CriarColaboradorBeneficio;
import fag.com.folhapagamento.core.usecases.colaborador.beneficio.ListarColaboradorBeneficio;
import fag.com.folhapagamento.infra.jakarta.mappers.JakartaColaboradorBeneficioMapper;
import fag.com.folhapagamento.infra.jakarta.mappers.JakartaColaboradorDescontoMapper;
import fag.com.folhapagamento.infra.jakarta.mappers.JakartaColaboradorMapper;
import fag.com.folhapagamento.infra.jakarta.models.JakartaColaboradorBeneficio;
import fag.com.folhapagamento.infra.jakarta.models.JakartaColaboradorDesconto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class JakartaColaboradorBeneficioRepository extends SimpleJpaRepository<JakartaColaboradorBeneficio, Long> implements ListarColaboradorBeneficio, CriarColaboradorBeneficio, AtualizarColaboradorBeneficio {

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
        JakartaColaboradorBeneficio colaboradorBeneficio = this.findById(id)
                .orElseThrow(ColaboradorBeneficioNaoEncontado::new);

        JakartaColaboradorBeneficio entity = JakartaColaboradorBeneficioMapper.toEntity(bo);
        entity.setId(colaboradorBeneficio.getId());

        this.em.merge(entity);

        return JakartaColaboradorBeneficioMapper.toDomain(entity);
    }

}
