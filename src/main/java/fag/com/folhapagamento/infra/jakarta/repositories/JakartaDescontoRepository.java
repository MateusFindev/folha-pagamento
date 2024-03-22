package fag.com.folhapagamento.infra.jakarta.repositories;

import fag.com.folhapagamento.infra.jakarta.models.JakartaContrato;
import fag.com.folhapagamento.infra.jakarta.models.JakartaDesconto;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class JakartaDescontoRepository extends SimpleJpaRepository<JakartaDesconto, Long> {

    private final EntityManager em;

    @Autowired
    public JakartaDescontoRepository(EntityManager em) {
        super(JakartaDesconto.class, em);
        this.em = em;
    }
}
