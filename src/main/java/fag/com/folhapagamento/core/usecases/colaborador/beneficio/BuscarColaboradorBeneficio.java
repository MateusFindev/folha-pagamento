package fag.com.folhapagamento.core.usecases.colaborador.beneficio;

import fag.com.folhapagamento.core.dtos.ColaboradorBeneficioDTO;
import fag.com.folhapagamento.core.usecases.Buscar;

public interface BuscarColaboradorBeneficio extends Buscar<ColaboradorBeneficioDTO> {

    ColaboradorBeneficioDTO findByColaboradorIdAndId(Long colaboradorId, Long beneficioId);

}
