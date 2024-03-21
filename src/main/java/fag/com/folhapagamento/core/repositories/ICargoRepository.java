package fag.com.folhapagamento.core.repositories;

import fag.com.folhapagamento.core.dtos.CargoDTO;

import java.util.List;

public interface ICargoRepository {

    List<CargoDTO> listAll();

}
