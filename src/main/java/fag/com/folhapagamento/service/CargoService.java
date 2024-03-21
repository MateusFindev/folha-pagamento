package fag.com.folhapagamento.service;

import fag.com.folhapagamento.core.dtos.CargoDTO;
import fag.com.folhapagamento.core.mappers.CargoMapper;
import fag.com.folhapagamento.infra.jakarta.mappers.JakartaCargoMapper;
import fag.com.folhapagamento.infra.jakarta.models.JakartaCargo;
import fag.com.folhapagamento.infra.jakarta.repositories.JakartaCargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CargoService {

    private final JakartaCargoRepository repository;

    @Autowired
    public CargoService(JakartaCargoRepository repository) {
        this.repository = repository;
    }

    public List<CargoDTO> list() {
        List<JakartaCargo> cargos = this.repository.findAll();

        if (cargos.isEmpty()) {
            return null;
        }

        return cargos.stream().map(cargo -> CargoMapper.toDTO(JakartaCargoMapper.toDomain(cargo))).toList();
    }

}
