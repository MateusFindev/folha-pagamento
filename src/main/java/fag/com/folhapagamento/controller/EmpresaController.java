package fag.com.folhapagamento.controller;

import fag.com.folhapagamento.core.dtos.EmpresaDTO;
import fag.com.folhapagamento.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/empresa")
public class EmpresaController {

    private final EmpresaService service;

    @Autowired
    public EmpresaController(EmpresaService service) {
        this.service = service;
    }

    @GetMapping("{cnpj}")
    public ResponseEntity<EmpresaDTO> findByCNPJ(@PathVariable String cnpj) {
        EmpresaDTO empresa = this.service.findByCNPJ(cnpj);

        return new ResponseEntity<>(empresa, HttpStatus.OK);
    }

}
