package fag.com.folhapagamento.core.exceptions.colaborador;

public class ColaboradorNaoEncontrado extends ColaboradorException {

    public ColaboradorNaoEncontrado(String message, Integer statusCode) {
        super(message, statusCode);
    }

}
