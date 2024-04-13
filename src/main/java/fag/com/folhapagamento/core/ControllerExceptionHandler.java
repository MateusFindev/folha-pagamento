package fag.com.folhapagamento.core;

import fag.com.folhapagamento.core.dtos.ExceptionDTO;
import fag.com.folhapagamento.core.exceptions.AbstractException;
import fag.com.folhapagamento.core.exceptions.colaborador.ColaboradorException;
import fag.com.folhapagamento.core.exceptions.folhapagamento.FolhaPagamentoException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ExceptionDTO> threatGeneralExceptions(Exception exception) {
        ExceptionDTO exceptionDTO = new ExceptionDTO(exception.getMessage(), "500");

        return ResponseEntity.internalServerError().body(exceptionDTO);
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<ExceptionDTO> threatDataIntegrityViolationExceptions(DataIntegrityViolationException exception) {
        ExceptionDTO exceptionDTO = new ExceptionDTO(exception.getMessage(), "400");

        return ResponseEntity.badRequest().body(exceptionDTO);
    }

    @ExceptionHandler(ColaboradorException.class)
    public ResponseEntity<ExceptionDTO> threatColaboradorException(ColaboradorException exception) {
        return getExceptionDTOResponseEntity(exception.getMessage(), exception.getStatusCode(), exception);
    }

    @ExceptionHandler(FolhaPagamentoException.class)
    public ResponseEntity<ExceptionDTO> threatFolhaPagamentoException(FolhaPagamentoException exception) {
        return getExceptionDTOResponseEntity(exception.getMessage(), exception.getStatusCode(), exception);
    }

    private ResponseEntity<ExceptionDTO> getExceptionDTOResponseEntity(String message, Integer statusCode, AbstractException exception) {
        ExceptionDTO exceptionDTO = new ExceptionDTO(message, String.valueOf(statusCode));

        return switch (statusCode) {
            case 400 -> ResponseEntity.badRequest().body(exceptionDTO);
            case 404 -> ResponseEntity.notFound().build();
            default -> ResponseEntity.internalServerError().body(exceptionDTO);
        };
    }

}
