package fag.com.folhapagamento.controller;

import fag.com.folhapagamento.core.dtos.DependenteDTO;
import fag.com.folhapagamento.service.DependenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/dependentes")
@CrossOrigin
public class DependenteController {

    private final DependenteService service;

    @Autowired
    public DependenteController(DependenteService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<DependenteDTO>> list() {
        List<DependenteDTO> dependentes = this.service.listAll();

        return new ResponseEntity<>(dependentes, HttpStatus.OK);
    }

}
