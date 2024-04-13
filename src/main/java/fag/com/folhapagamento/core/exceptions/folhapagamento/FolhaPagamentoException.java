package fag.com.folhapagamento.core.exceptions.folhapagamento;

import fag.com.folhapagamento.core.exceptions.AbstractException;

public class FolhaPagamentoException extends AbstractException {

    public FolhaPagamentoException(String message, Integer statusCode) {
        super(message, statusCode);
    }

}
