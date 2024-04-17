package fag.com.folhapagamento.core.usecases.dependente;

import fag.com.folhapagamento.core.dtos.DependenteDTO;
import fag.com.folhapagamento.core.usecases.Buscar;

public interface BuscarDependente extends Buscar<DependenteDTO> {

    DependenteDTO findByColaboradorIdAndId(Long colaboradorId, Long dependenteId);

}
