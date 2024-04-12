package fag.com.folhapagamento.core.usecases.colaborador.beneficio;

import fag.com.folhapagamento.core.dtos.ColaboradorBeneficioDTO;
import fag.com.folhapagamento.core.usecases.Listar;

import java.util.List;

public interface ListarColaboradorBeneficio extends Listar<ColaboradorBeneficioDTO> {

    List<ColaboradorBeneficioDTO> listAllByColaboradorId(Long id);

}
