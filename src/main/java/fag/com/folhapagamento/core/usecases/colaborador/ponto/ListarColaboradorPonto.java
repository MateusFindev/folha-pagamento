package fag.com.folhapagamento.core.usecases.colaborador.ponto;

import fag.com.folhapagamento.core.dtos.ColaboradorPontoDTO;
import fag.com.folhapagamento.core.usecases.Listar;

import java.util.List;

public interface ListarColaboradorPonto extends Listar<ColaboradorPontoDTO> {

    List<ColaboradorPontoDTO> listAllByColaboradorId(Long colaboradorId);

}
