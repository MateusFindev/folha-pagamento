package fag.com.folhapagamento.controller;

import fag.com.folhapagamento.service.ContratoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/contratos")
@CrossOrigin
public class ContratoController {

    public ContratoService service;

    @Autowired
    public ContratoController(ContratoService service) {
        this.service = service;
    }

}
