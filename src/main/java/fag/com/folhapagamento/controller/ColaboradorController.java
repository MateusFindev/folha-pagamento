package fag.com.folhapagamento.controller;

import fag.com.folhapagamento.service.ColaboradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/colaboradores")
@CrossOrigin
public class ColaboradorController {

    private final ColaboradorService service;

    @Autowired
    public ColaboradorController(ColaboradorService service) {
        this.service = service;
    }

}
