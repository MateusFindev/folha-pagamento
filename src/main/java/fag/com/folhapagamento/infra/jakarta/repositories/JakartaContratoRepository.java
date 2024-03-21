package fag.com.folhapagamento.infra.jakarta.repositories;

import fag.com.folhapagamento.infra.jakarta.models.JakartaContrato;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

@Service
public class JakartaContratoRepository extends SimpleJpaRepository<JakartaContrato, Long> {

    private final EntityManager em;

    @Autowired
    public JakartaContratoRepository(EntityManager em) {
        super(JakartaContrato.class, em);
        this.em = em;
    }

}
