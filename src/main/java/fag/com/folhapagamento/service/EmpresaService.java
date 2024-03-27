package fag.com.folhapagamento.service;

import fag.com.folhapagamento.core.dtos.EmpresaDTO;
import fag.com.folhapagamento.core.mappers.EmpresaMapper;
import fag.com.folhapagamento.infra.jakarta.mappers.JakartaEmpresaMapper;
import fag.com.folhapagamento.infra.jakarta.models.JakartaEmpresa;
import fag.com.folhapagamento.infra.jakarta.repositories.JakartaEmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService {

    private final JakartaEmpresaRepository repository;

    @Autowired
    public EmpresaService(JakartaEmpresaRepository repository) {
        this.repository = repository;
    }

    public EmpresaDTO findByCNPJ(String cnpj) {
        JakartaEmpresa empresa = this.repository.findByCNPJ(cnpj);

        if (empresa == null) {
            return null;
        }

        return EmpresaMapper.toDTO(JakartaEmpresaMapper.toDomain(empresa));
    }

}
