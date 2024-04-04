package fag.com.folhapagamento.core.usecases.contrato;

import fag.com.folhapagamento.core.dtos.ContratoDTO;
import fag.com.folhapagamento.core.usecases.Buscar;

public interface BuscarContrato extends Buscar<ContratoDTO> {

    ContratoDTO findByColaboradorId(Long id);

}
