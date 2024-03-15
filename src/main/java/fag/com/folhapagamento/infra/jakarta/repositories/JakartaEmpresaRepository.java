package fag.com.folhapagamento.infra.jakarta.repositories;

import fag.com.folhapagamento.infra.jakarta.models.JakartaEmpresa;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

@Service
public class JakartaEmpresaRepository extends SimpleJpaRepository<JakartaEmpresa, Long> {

    private final EntityManager em;

    @Autowired
    public JakartaEmpresaRepository(EntityManager em) {
        super(JakartaEmpresa.class, em);
        this.em = em;
    }

}
