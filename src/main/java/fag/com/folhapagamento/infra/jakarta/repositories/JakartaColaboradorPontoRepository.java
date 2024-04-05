package fag.com.folhapagamento.infra.jakarta.repositories;

import fag.com.folhapagamento.infra.jakarta.models.JakartaColaboradorPonto;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

@Service
public class JakartaColaboradorPontoRepository extends SimpleJpaRepository<JakartaColaboradorPonto, Long> {

    private final EntityManager em;

    @Autowired
    public JakartaColaboradorPontoRepository(EntityManager em) {
        super(JakartaColaboradorPonto.class, em);
        this.em = em;
    }

}
