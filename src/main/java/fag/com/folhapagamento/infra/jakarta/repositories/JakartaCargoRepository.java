package fag.com.folhapagamento.infra.jakarta.repositories;

import fag.com.folhapagamento.core.dtos.CargoDTO;
import fag.com.folhapagamento.core.mappers.CargoMapper;
import fag.com.folhapagamento.core.repositories.ICargoRepository;
import fag.com.folhapagamento.infra.jakarta.mappers.JakartaCargoMapper;
import fag.com.folhapagamento.infra.jakarta.models.JakartaCargo;
import jakarta.persistence.EntityManager;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JakartaCargoRepository extends SimpleJpaRepository<JakartaCargo, Long> implements ICargoRepository {

    private final EntityManager em;

    public JakartaCargoRepository(EntityManager em) {
        super(JakartaCargo.class, em);
        this.em = em;
    }

    @Override
    public List<CargoDTO> listAll() {
        List<JakartaCargo> cargos = this.findAll();

        return cargos.stream().map(cargo -> CargoMapper.toDTO(JakartaCargoMapper.toDomain(cargo))).toList();
    }

}
