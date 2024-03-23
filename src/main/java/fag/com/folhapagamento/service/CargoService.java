package fag.com.folhapagamento.service;

import fag.com.folhapagamento.core.dtos.CargoDTO;
import fag.com.folhapagamento.core.usecases.cargo.ListarCargos;
import fag.com.folhapagamento.infra.jakarta.repositories.JakartaCargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CargoService implements ListarCargos {

    private final JakartaCargoRepository repository;

    @Autowired
    public CargoService(JakartaCargoRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<CargoDTO> listAll() {
        return this.repository.listAll();
    }

}
