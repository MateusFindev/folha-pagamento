package fag.com.folhapagamento.infra.jakarta.repositories;

import fag.com.folhapagamento.infra.jakarta.models.JakartaCargo;
import jakarta.persistence.EntityManager;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

@Service
public class JakartaCargoRepository extends SimpleJpaRepository<JakartaCargo, Long> {

    private final EntityManager em;

    public JakartaCargoRepository(EntityManager em) {
        super(JakartaCargo.class, em);
        this.em = em;
    }

}
