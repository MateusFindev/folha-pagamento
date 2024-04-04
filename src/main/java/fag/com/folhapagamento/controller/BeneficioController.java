package fag.com.folhapagamento.controller;

import fag.com.folhapagamento.core.dtos.BeneficioDTO;
import fag.com.folhapagamento.service.BeneficioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/beneficios")
@CrossOrigin
public class BeneficioController {

    private final BeneficioService service;

    @Autowired
    public BeneficioController(BeneficioService service) {this.service = service;}

    @GetMapping
    public ResponseEntity<List<BeneficioDTO>> list() {
        List<BeneficioDTO> beneficios = this.service.listAll();

        return new ResponseEntity<>(beneficios, HttpStatus.OK);
    }

}
