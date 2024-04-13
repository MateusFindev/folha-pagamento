package fag.com.folhapagamento.core.exceptions.colaborador;

public class ColaboradorJaPossuiDesconto extends ColaboradorException {

    public ColaboradorJaPossuiDesconto(String message, Integer statusCode) {
        super(message, statusCode);
    }

}
