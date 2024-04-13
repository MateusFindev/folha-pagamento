package fag.com.folhapagamento.core.exceptions.colaborador.desconto;

import fag.com.folhapagamento.core.exceptions.colaborador.ColaboradorException;

public class ColaboradorDescontoNaoEncontrado extends ColaboradorException {

    public ColaboradorDescontoNaoEncontrado(String message, Integer statusCode) {
        super(message, statusCode);
    }

}
