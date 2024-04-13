package fag.com.folhapagamento.core.exceptions.folhapagamento;

public class FolhaPagamentoNaoCriada extends FolhaPagamentoException {

    public FolhaPagamentoNaoCriada(String message, Integer statusCode) {
        super(message, statusCode);
    }

}
