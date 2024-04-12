package fag.com.folhapagamento.controller;

import fag.com.folhapagamento.core.dtos.BeneficioDTO;
import fag.com.folhapagamento.core.dtos.ColaboradorDTO;
import fag.com.folhapagamento.core.dtos.DescontoDTO;
import fag.com.folhapagamento.service.ColaboradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/colaboradores")
@CrossOrigin
public class ColaboradorController {

    private final ColaboradorService service;

    @Autowired
    public ColaboradorController(ColaboradorService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<ColaboradorDTO>> list() {
        List<ColaboradorDTO> colaboradores = this.service.listAll();

        return new ResponseEntity<>(colaboradores, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<ColaboradorDTO> findById(@PathVariable Long id) {
        ColaboradorDTO colaborador = this.service.customFindById(id);

        return new ResponseEntity<>(colaborador, HttpStatus.OK);
    }

    @PostMapping("{id}/beneficios")
    public ResponseEntity<ColaboradorDTO> adicionarBeneficio(@PathVariable Long id, @RequestBody BeneficioDTO dto) {
        ColaboradorDTO colaborador = this.service.adicionarBeneficio(id, dto);

        return new ResponseEntity<>(colaborador, HttpStatus.OK);
    }

    @PostMapping("{id}/descontos")
    public ResponseEntity<ColaboradorDTO> adicionarDesconto(@PathVariable Long id, @RequestBody DescontoDTO dto) {
        ColaboradorDTO colaborador = this.service.adicionarDesconto(id, dto);

        return new ResponseEntity<>(colaborador, HttpStatus.OK);
    }

}
