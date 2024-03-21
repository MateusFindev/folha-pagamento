package fag.com.folhapagamento.controller;

import fag.com.folhapagamento.core.dtos.CargoDTO;
import fag.com.folhapagamento.service.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/cargos")
@CrossOrigin
public class CargoController {

    private final CargoService service;

    @Autowired
    public CargoController(CargoService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<CargoDTO>> list() {
        List<CargoDTO> cargos = this.service.listAll();

        return new ResponseEntity<>(cargos, HttpStatus.OK);
    }

}
