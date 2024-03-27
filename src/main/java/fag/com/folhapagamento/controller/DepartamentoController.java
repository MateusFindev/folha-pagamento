package fag.com.folhapagamento.controller;

import fag.com.folhapagamento.core.dtos.DepartamentoDTO;
import fag.com.folhapagamento.service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/departamentos")
@CrossOrigin
public class DepartamentoController {

    private final DepartamentoService service;

    @Autowired
    public DepartamentoController(DepartamentoService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<DepartamentoDTO>> list() {
        List<DepartamentoDTO> departamentos = this.service.listAll();

        return new ResponseEntity<>(departamentos, HttpStatus.OK);
    }

}
