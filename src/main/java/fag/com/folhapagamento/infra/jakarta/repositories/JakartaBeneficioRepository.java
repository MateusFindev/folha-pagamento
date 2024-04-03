package fag.com.folhapagamento.infra.jakarta.repositories;

import fag.com.folhapagamento.core.dtos.BeneficioDTO;
import fag.com.folhapagamento.core.mappers.BeneficioMapper;
import fag.com.folhapagamento.core.usecases.beneficio.ListarBeneficios;
import fag.com.folhapagamento.infra.jakarta.mappers.JakartaBeneficioMapper;
import fag.com.folhapagamento.infra.jakarta.models.JakartaBeneficio;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JakartaBeneficioRepository extends SimpleJpaRepository<JakartaBeneficio,Long> implements ListarBeneficios {

    private final EntityManager em;

    @Autowired
    public JakartaBeneficioRepository(EntityManager em) {
        super(JakartaBeneficio.class, em);
        this.em = em;
    }

    @Override
    public List<BeneficioDTO> listAll() {
        List<JakartaBeneficio> beneficios = this.findAll();

        return beneficios.stream().map(beneficio -> BeneficioMapper.toDTO(JakartaBeneficioMapper.toDomain(beneficio))).toList();
    }
}
