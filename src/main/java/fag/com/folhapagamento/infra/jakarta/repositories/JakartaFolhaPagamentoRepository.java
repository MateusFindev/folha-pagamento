package fag.com.folhapagamento.infra.jakarta.repositories;

import fag.com.folhapagamento.core.dtos.FolhaPagamentoDTO;
import fag.com.folhapagamento.core.entities.FolhaPagamentoBO;
import fag.com.folhapagamento.core.mappers.FolhaPagamentoMapper;
import fag.com.folhapagamento.core.usecases.folhapagamento.CriarFolhaPagamento;
import fag.com.folhapagamento.core.usecases.folhapagamento.ListarFolhaPagamento;
import fag.com.folhapagamento.infra.jakarta.mappers.JakartaColaboradorMapper;
import fag.com.folhapagamento.infra.jakarta.mappers.JakartaFolhaPagamentoMapper;
import fag.com.folhapagamento.infra.jakarta.models.JakartaFolhaPagamento;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class JakartaFolhaPagamentoRepository extends SimpleJpaRepository<JakartaFolhaPagamento, Long> implements ListarFolhaPagamento, CriarFolhaPagamento {

    private final EntityManager em;

    @Autowired
    public JakartaFolhaPagamentoRepository(EntityManager em) {
        super(JakartaFolhaPagamento.class, em);
        this.em = em;
    }

    @Override
    public List<FolhaPagamentoDTO> listAll() {
        List<JakartaFolhaPagamento> folhas = this.findAll();

        return folhas.stream().map(folha -> FolhaPagamentoMapper.toDTO(JakartaFolhaPagamentoMapper.toDomain(folha))).collect(Collectors.toList());
    }

    @Override
    public FolhaPagamentoBO create(FolhaPagamentoBO bo) {
        bo.calcularSalarioLiquido();

        JakartaFolhaPagamento entity = JakartaFolhaPagamentoMapper.toEntity(bo);
        entity.setColaborador(JakartaColaboradorMapper.toEntity(bo.getColaborador(), true));

        em.persist(entity);
        em.flush();

        return JakartaFolhaPagamentoMapper.toDomain(entity);
    }

}
