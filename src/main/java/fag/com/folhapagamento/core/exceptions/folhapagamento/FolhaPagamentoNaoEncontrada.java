package fag.com.folhapagamento.core.exceptions.folhapagamento;

public class FolhaPagamentoNaoEncontrada extends FolhaPagamentoException {

    public FolhaPagamentoNaoEncontrada(String message, Integer statusCode) {
        super(message, statusCode);
    }

}
