package fag.com.folhapagamento.core.usecases.departamento;

import fag.com.folhapagamento.core.dtos.CargoDTO;
import fag.com.folhapagamento.core.dtos.DepartamentoDTO;
import fag.com.folhapagamento.core.usecases.Listar;

import java.util.List;

public interface ListarDepartamentos extends Listar<DepartamentoDTO> {

    List<CargoDTO> listAllCargos(Long id);

}
