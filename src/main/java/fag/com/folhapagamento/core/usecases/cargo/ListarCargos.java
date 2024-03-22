package fag.com.folhapagamento.core.usecases.cargo;

import fag.com.folhapagamento.core.dtos.CargoDTO;
import fag.com.folhapagamento.core.repositories.ICargoRepository;

import java.util.List;

public class ListarCargos {

    private final ICargoRepository repository;

    public ListarCargos(ICargoRepository repository) {
        this.repository = repository;
    }

    public List<CargoDTO> execute() {
        return this.repository.listAll();
    }

}
