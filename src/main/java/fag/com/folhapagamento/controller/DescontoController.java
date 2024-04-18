package fag.com.folhapagamento.controller;

import fag.com.folhapagamento.core.dtos.ColaboradorDTO;
import fag.com.folhapagamento.core.dtos.DescontoDTO;
import fag.com.folhapagamento.service.DescontoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/descontos")
@CrossOrigin
public class DescontoController {
    private final DescontoService service;

    @Autowired
    public DescontoController(DescontoService service) {
        this.service = service;
    }


    @GetMapping
    public ResponseEntity<List<DescontoDTO>> list() {
        List<DescontoDTO> descontos = this.service.listAll();

        return new ResponseEntity<>(descontos, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<DescontoDTO> findById(@PathVariable Long id) {
        DescontoDTO desconto = this.service.customFindById(id);

        return new ResponseEntity<>(desconto, desconto == null ? HttpStatus.NO_CONTENT : HttpStatus.OK);
    }
}
