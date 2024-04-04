package fag.com.folhapagamento.infra.jakarta.repositories;

import fag.com.folhapagamento.infra.jakarta.models.JakartaFolhaPagamento;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

@Service
public class JakartaFolhaPagamentoRepository extends SimpleJpaRepository<JakartaFolhaPagamento, Long> {

    private final EntityManager em;

    @Autowired
    public JakartaFolhaPagamentoRepository(EntityManager em) {
        super(JakartaFolhaPagamento.class, em);
        this.em = em;
    }

}
