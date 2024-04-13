package fag.com.folhapagamento.core.exceptions.colaborador;

import fag.com.folhapagamento.core.exceptions.AbstractException;

public class ColaboradorException extends AbstractException {

    public ColaboradorException(String message, Integer statusCode) {
        super(message, statusCode);
    }

}