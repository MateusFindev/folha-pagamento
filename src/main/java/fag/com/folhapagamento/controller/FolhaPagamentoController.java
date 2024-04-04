package fag.com.folhapagamento.controller;

import fag.com.folhapagamento.service.FolhaPagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/folhas-pagamento")
@CrossOrigin
public class FolhaPagamentoController {

    private final FolhaPagamentoService service;

    @Autowired
    public FolhaPagamentoController(FolhaPagamentoService service) {
        this.service = service;
    }

}
