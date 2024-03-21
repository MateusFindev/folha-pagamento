package fag.com.folhapagamento.infra.jakarta.repositories;

import fag.com.folhapagamento.infra.jakarta.models.JakartaColaborador;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

@Service
public class JakartaColaboradorRepository extends SimpleJpaRepository<JakartaColaborador, Long> {

    private final EntityManager em;

    @Autowired
    public JakartaColaboradorRepository(EntityManager em) {
        super(JakartaColaborador.class, em);
        this.em = em;
    }

}
