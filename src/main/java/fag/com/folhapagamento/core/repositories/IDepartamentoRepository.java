package fag.com.folhapagamento.core.repositories;

import fag.com.folhapagamento.core.dtos.DepartamentoDTO;

import java.util.List;

public interface IDepartamentoRepository {

    List<DepartamentoDTO> listAll();

}
