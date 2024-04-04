package fag.com.folhapagamento.core.usecases.colaborador.desconto;

import fag.com.folhapagamento.core.dtos.ColaboradorDescontoDTO;
import fag.com.folhapagamento.core.usecases.Listar;

import java.util.List;

public interface ListarColaboradorDesconto extends Listar<ColaboradorDescontoDTO> {

    List<ColaboradorDescontoDTO> listAllByColaboradorId(Long id);

}
