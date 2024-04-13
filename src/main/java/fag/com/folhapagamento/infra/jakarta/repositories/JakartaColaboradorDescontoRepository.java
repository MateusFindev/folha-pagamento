package fag.com.folhapagamento.infra.jakarta.repositories;

import fag.com.folhapagamento.core.dtos.ColaboradorDescontoDTO;
import fag.com.folhapagamento.core.entities.ColaboradorDescontoBO;
import fag.com.folhapagamento.core.exceptions.colaborador.desconto.ColaboradorDescontoNaoEncontrado;
import fag.com.folhapagamento.core.mappers.ColaboradorDescontoMapper;
import fag.com.folhapagamento.core.usecases.colaborador.desconto.AtualizarColaboradorDesconto;
import fag.com.folhapagamento.core.usecases.colaborador.desconto.CriarColaboradorDesconto;
import fag.com.folhapagamento.core.usecases.colaborador.desconto.ListarColaboradorDesconto;
import fag.com.folhapagamento.infra.jakarta.mappers.JakartaColaboradorDescontoMapper;
import fag.com.folhapagamento.infra.jakarta.mappers.JakartaColaboradorMapper;
import fag.com.folhapagamento.infra.jakarta.models.JakartaColaboradorDesconto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class JakartaColaboradorDescontoRepository extends SimpleJpaRepository<JakartaColaboradorDesconto, Long> implements ListarColaboradorDesconto, CriarColaboradorDesconto, AtualizarColaboradorDesconto {

    private final EntityManager em;

    @Autowired
    public JakartaColaboradorDescontoRepository(EntityManager em) {
        super(JakartaColaboradorDesconto.class, em);
        this.em = em;
    }

    @Override
    public ColaboradorDescontoBO create(ColaboradorDescontoBO bo) {
        JakartaColaboradorDesconto entity = JakartaColaboradorDescontoMapper.toEntity(bo);
        entity.setColaborador(JakartaColaboradorMapper.toEntity(bo.getColaborador(), true));

        em.persist(entity);
        em.flush();

        return JakartaColaboradorDescontoMapper.toDomain(entity);
    }

    @Override
    public List<ColaboradorDescontoDTO> listAll() {
        List<JakartaColaboradorDesconto> colaboradorDescontos = this.findAll();

        return colaboradorDescontos.stream().map(colaboradorDesconto -> ColaboradorDescontoMapper.toDTO(JakartaColaboradorDescontoMapper.toDomain(colaboradorDesconto))).collect(Collectors.toList());
    }

    @Override
    public List<ColaboradorDescontoDTO> listAllByColaboradorId(Long id) {
        TypedQuery<JakartaColaboradorDesconto> query = em.createQuery("SELECT e FROM JakartaColaboradorDesconto e WHERE e.colaborador.id = :id", JakartaColaboradorDesconto.class)
                .setParameter("id", id);

        try {
            return query.getResultList().stream().map(colaboradorDesconto -> ColaboradorDescontoMapper.toDTO(JakartaColaboradorDescontoMapper.toDomain(colaboradorDesconto))).collect(Collectors.toList());
        } catch (NoResultException e) {
            return null;
        }
    }

    @Override
    public ColaboradorDescontoBO update(Long id, ColaboradorDescontoBO colaboradorDescontoBO) {
        JakartaColaboradorDesconto colaboradorDesconto = this.findById(id).orElse(null);

        if (colaboradorDesconto == null) {
            throw new ColaboradorDescontoNaoEncontrado("Não foi possível encontrar esse benefício para o colaborador", 400);
        }

        JakartaColaboradorDesconto entity = JakartaColaboradorDescontoMapper.toEntity(colaboradorDescontoBO);
        entity.setId(colaboradorDesconto.getId());

        this.em.merge(entity);

        return JakartaColaboradorDescontoMapper.toDomain(entity);
    }

}
