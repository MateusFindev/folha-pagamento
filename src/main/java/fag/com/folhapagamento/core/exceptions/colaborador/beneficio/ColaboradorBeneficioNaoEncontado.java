package fag.com.folhapagamento.core.exceptions.colaborador.beneficio;

import fag.com.folhapagamento.core.exceptions.colaborador.ColaboradorException;

public class ColaboradorBeneficioNaoEncontado extends ColaboradorException {

    public ColaboradorBeneficioNaoEncontado(String message, Integer statusCode) {
        super(message, statusCode);
    }

}
