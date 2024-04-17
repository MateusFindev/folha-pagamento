package fag.com.folhapagamento.controller;

import fag.com.folhapagamento.core.dtos.*;
import fag.com.folhapagamento.service.*;
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

    private final ColaboradorBeneficioService colaboradorBeneficioService;

    private final ContratoService contratoService;

    private final ColaboradorDescontoService colaboradorDescontoService;

    private final ColaboradorPontoService colaboradorPontoService;

    @Autowired
    public ColaboradorController(ColaboradorService service, ColaboradorBeneficioService colaboradorBeneficioService, ContratoService contratoService, ColaboradorDescontoService colaboradorDescontoService, ColaboradorPontoService colaboradorPontoService) {
        this.service = service;
        this.colaboradorBeneficioService = colaboradorBeneficioService;
        this.contratoService = contratoService;
        this.colaboradorDescontoService = colaboradorDescontoService;
        this.colaboradorPontoService = colaboradorPontoService;
    }

    @GetMapping
    public ResponseEntity<List<ColaboradorDTO>> list() {
        List<ColaboradorDTO> colaboradores = this.service.listAll();

        return new ResponseEntity<>(colaboradores, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<ColaboradorDTO> findById(@PathVariable Long id) {
        ColaboradorDTO colaborador = this.service.customFindById(id);

        return new ResponseEntity<>(colaborador, colaborador == null ? HttpStatus.NO_CONTENT : HttpStatus.OK);
    }

    @GetMapping("{id}/contrato")
    public ResponseEntity<ContratoDTO> findContratoByColaboradorId(@PathVariable Long id) {
        ContratoDTO contrato = contratoService.findByColaboradorId(id);

        return new ResponseEntity<>(contrato, contrato == null ? HttpStatus.NO_CONTENT : HttpStatus.OK);
    }

    @GetMapping("{colaboradorId}/ponto")
    public ResponseEntity<ColaboradorPontoDTO> findDependenteByColaboradorId(@PathVariable Long colaboradorId) {
        ColaboradorPontoDTO ponto = this.colaboradorPontoService.findByColaboradorId(colaboradorId);

        return new ResponseEntity<>(ponto, ponto == null ? HttpStatus.NO_CONTENT : HttpStatus.OK);
    }

    @GetMapping("{colaboradorId}/beneficios/{beneficioId}")
    public ResponseEntity<ColaboradorBeneficioDTO> findColaboradorBeneficioByColaboradorId(@PathVariable Long colaboradorId, @PathVariable Long beneficioId) {
        ColaboradorBeneficioDTO beneficio = this.colaboradorBeneficioService.findByColaboradorIdAndId(colaboradorId, beneficioId);

        return new ResponseEntity<>(beneficio, beneficio == null ? HttpStatus.NO_CONTENT : HttpStatus.OK);
    }

    @GetMapping("{colaboradorId}/descontos/{descontoId}")
    public ResponseEntity<ColaboradorDescontoDTO> findColaboradorDescontoByColaboradorId(@PathVariable Long colaboradorId, @PathVariable Long descontoId) {
        ColaboradorDescontoDTO desconto = this.colaboradorDescontoService.findByColaboradorIdAndId(colaboradorId, descontoId);

        return new ResponseEntity<>(desconto, desconto == null ? HttpStatus.NO_CONTENT : HttpStatus.OK);
    }

}
