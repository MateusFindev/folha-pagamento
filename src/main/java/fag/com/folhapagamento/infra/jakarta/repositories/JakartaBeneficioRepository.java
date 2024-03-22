package fag.com.folhapagamento.infra.jakarta.repositories;

import fag.com.folhapagamento.infra.jakarta.models.JakartaBeneficio;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

@Service
public class JakartaBeneficioRepository extends SimpleJpaRepository<JakartaBeneficio,Long> {

    private final EntityManager em;

    @Autowired
    public JakartaBeneficioRepository(EntityManager em) {
        super(JakartaBeneficio.class, em);
        this.em = em;
    }
}
