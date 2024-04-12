package fag.com.folhapagamento.controller;

import fag.com.folhapagamento.core.dtos.FolhaPagamentoDTO;
import fag.com.folhapagamento.service.FolhaPagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/folhaspagamento")
@CrossOrigin
public class FolhaPagamentoController {

    private final FolhaPagamentoService service;

    @Autowired
    public FolhaPagamentoController(FolhaPagamentoService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<FolhaPagamentoDTO>> list() {
        List<FolhaPagamentoDTO> folhas = this.service.listAll();

        return new ResponseEntity<>(folhas, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<FolhaPagamentoDTO> findById(@PathVariable Long id) {
        FolhaPagamentoDTO folha = this.service.customFindById(id);

        return new ResponseEntity<>(folha, folha == null ? HttpStatus.NO_CONTENT : HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<FolhaPagamentoDTO> create(@RequestBody FolhaPagamentoDTO dto) {
        FolhaPagamentoDTO folha = this.service.create(dto);

        return new ResponseEntity<>(folha, HttpStatus.CREATED);
    }

}
