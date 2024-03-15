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

    @GetMapping("{id}")
    public ResponseEntity<EmpresaDTO> findById(@PathVariable Long id) {
        EmpresaDTO empresa = this.service.findById(id);

        return new ResponseEntity<>(empresa, HttpStatus.OK);
    }

}
