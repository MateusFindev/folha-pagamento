package fag.com.folhapagamento.service;

import fag.com.folhapagamento.infra.jakarta.repositories.JakartaCargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CargoService {

    private final JakartaCargoRepository repository;

    @Autowired
    public CargoService(JakartaCargoRepository repository) {
        this.repository = repository;
    }

}
