package fag.com.folhapagamento.infra.jakarta.repositories;

import fag.com.folhapagamento.core.dtos.ColaboradorPontoDTO;
import fag.com.folhapagamento.core.mappers.ColaboradorPontoMapper;
import fag.com.folhapagamento.core.usecases.colaborador.ponto.BuscarColaboradorPonto;
import fag.com.folhapagamento.core.usecases.colaborador.ponto.ListarColaboradorPonto;
import fag.com.folhapagamento.infra.jakarta.mappers.JakartaColaboradorPontoMapper;
import fag.com.folhapagamento.infra.jakarta.models.JakartaColaboradorPonto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class JakartaColaboradorPontoRepository extends SimpleJpaRepository<JakartaColaboradorPonto, Long> implements BuscarColaboradorPonto, ListarColaboradorPonto {

    private final EntityManager em;

    @Autowired
    public JakartaColaboradorPontoRepository(EntityManager em) {
        super(JakartaColaboradorPonto.class, em);
        this.em = em;
    }

    @Override
    public ColaboradorPontoDTO customFindById(Long id) {
        JakartaColaboradorPonto ponto = this.findById(id).orElse(null);

        if (ponto == null) {
            return null;
        }

        return ColaboradorPontoMapper.toDTO(JakartaColaboradorPontoMapper.toDomain(ponto));
    }

    @Override
    public List<ColaboradorPontoDTO> listAllByColaboradorId(Long colaboradorId) {
        TypedQuery<JakartaColaboradorPonto> query = em.createQuery("SELECT e FROM JakartaColaboradorPonto e WHERE e.colaborador.id = :colaboradorId", JakartaColaboradorPonto.class)
                .setParameter("colaboradorId", colaboradorId);

        try {
            return query.getResultList().stream()
                    .map(colaboradorPonto -> ColaboradorPontoMapper.toDTO(JakartaColaboradorPontoMapper.toDomain(colaboradorPonto)))
                    .collect(Collectors.toList());
        } catch (NoResultException e) {
            return null;
        }
    }

    @Override
    public List<ColaboradorPontoDTO> listAll() {
        return this.findAll().stream()
                .map(colaboradorPonto -> ColaboradorPontoMapper.toDTO(JakartaColaboradorPontoMapper.toDomain(colaboradorPonto)))
                .collect(Collectors.toList());
    }

}
