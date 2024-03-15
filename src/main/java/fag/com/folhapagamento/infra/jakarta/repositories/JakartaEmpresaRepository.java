package fag.com.folhapagamento.infra.jakarta.repositories;

import fag.com.folhapagamento.infra.jakarta.models.JakartaEmpresa;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

@Service
public class JakartaEmpresaRepository extends SimpleJpaRepository<JakartaEmpresa, String> {

    private final EntityManager em;

    @Autowired
    public JakartaEmpresaRepository(EntityManager em) {
        super(JakartaEmpresa.class, em);
        this.em = em;
    }

    public JakartaEmpresa findByCNPJ(String cnpj) {
        TypedQuery<JakartaEmpresa> query = em.createQuery("SELECT e FROM JakartaEmpresa e WHERE e.cnpj = :cnpj", JakartaEmpresa.class)
                .setParameter("cnpj", cnpj);

        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

}
