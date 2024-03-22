package fag.com.folhapagamento.controller;

import fag.com.folhapagamento.service.DescontoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/descontos")
@CrossOrigin
public class DescontoController {
    private final DescontoService service;

    @Autowired
    public DescontoController (DescontoService service) {this.service = service;}
}
