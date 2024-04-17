package fag.com.folhapagamento.core.usecases.colaborador.desconto;

import fag.com.folhapagamento.core.dtos.ColaboradorDescontoDTO;
import fag.com.folhapagamento.core.usecases.Buscar;

public interface BuscarColaboradorDesconto extends Buscar<ColaboradorDescontoDTO> {

    ColaboradorDescontoDTO findByColaboradorIdAndId(Long colaboradorId, Long beneficioId);

}

