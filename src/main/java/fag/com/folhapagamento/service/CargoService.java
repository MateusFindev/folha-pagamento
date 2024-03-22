package fag.com.folhapagamento.service;

import fag.com.folhapagamento.core.dtos.CargoDTO;
import fag.com.folhapagamento.core.mappers.CargoMapper;
import fag.com.folhapagamento.core.repositories.ICargoRepository;
import fag.com.folhapagamento.core.usecases.cargo.ListarCargos;
import fag.com.folhapagamento.infra.jakarta.mappers.JakartaCargoMapper;
import fag.com.folhapagamento.infra.jakarta.models.JakartaCargo;
import fag.com.folhapagamento.infra.jakarta.repositories.JakartaCargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CargoService implements ICargoRepository {

    private final JakartaCargoRepository repository;

    @Autowired
    public CargoService(JakartaCargoRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<CargoDTO> listAll() {
        ListarCargos listarCargos = new ListarCargos(this.repository);

        return listarCargos.execute();
    }

}
