package fag.com.folhapagamento.controller;

import fag.com.folhapagamento.service.BeneficioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/beneficios")
@CrossOrigin
public class BeneficioController {

    private final BeneficioService service;

    @Autowired
    public BeneficioController(BeneficioService service) {this.service = service;}

}
