package fag.com.folhapagamento.service;

import fag.com.folhapagamento.core.dtos.ColaboradorDTO;
import fag.com.folhapagamento.core.dtos.FolhaPagamentoDTO;
import fag.com.folhapagamento.core.entities.FolhaPagamentoBO;
import fag.com.folhapagamento.core.enums.EnumMes;
import fag.com.folhapagamento.core.exceptions.folhapagamento.FolhaPagamentoNaoCriada;
import fag.com.folhapagamento.core.mappers.FolhaPagamentoMapper;
import fag.com.folhapagamento.core.usecases.folhapagamento.BuscarFolhaPagamento;
import fag.com.folhapagamento.core.usecases.folhapagamento.ListarFolhaPagamento;
import fag.com.folhapagamento.infra.jakarta.mappers.JakartaFolhaPagamentoMapper;
import fag.com.folhapagamento.infra.jakarta.models.JakartaFolhaPagamento;
import fag.com.folhapagamento.infra.jakarta.repositories.JakartaFolhaPagamentoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
public class FolhaPagamentoService  implements ListarFolhaPagamento, BuscarFolhaPagamento {

    private final JakartaFolhaPagamentoRepository repository;

    private final ColaboradorService colaboradorService;

    @Autowired
    public FolhaPagamentoService(JakartaFolhaPagamentoRepository repository, ColaboradorService colaboradorService) {
        this.repository = repository;
        this.colaboradorService = colaboradorService;
    }

    @Override
    public List<FolhaPagamentoDTO> listAll() {
        return this.repository.listAll();
    }

    @Override
    public FolhaPagamentoDTO customFindById(Long id) {
        JakartaFolhaPagamento folha = this.repository.findById(id).orElse(null);

        if (folha == null) {
            return null;
        }

        return FolhaPagamentoMapper.toDTO(JakartaFolhaPagamentoMapper.toDomain(folha, true));
    }

    @Transactional
    public FolhaPagamentoDTO create(FolhaPagamentoDTO dto) {
        try {
            FolhaPagamentoBO entity = this.repository.create(FolhaPagamentoMapper.toBO(dto));

            return FolhaPagamentoMapper.toDTO(entity);
        } catch (Exception e) {
            throw new FolhaPagamentoNaoCriada("Não foi possível emitir a folha de pagamento", 500);
        }
    }

    @Transactional
    public FolhaPagamentoDTO create(Long idColaborador) {
        ColaboradorDTO colaborador = this.colaboradorService.customFindById(idColaborador);

        FolhaPagamentoDTO dto = new FolhaPagamentoDTO();
        dto.setColaborador(colaborador);
        dto.setSalarioBruto(colaborador.getSalarioBase());

        LocalDate hoje = LocalDate.now();
        dto.setMes(EnumMes.values()[hoje.getMonthValue()]);
        dto.setDiasUteis(FolhaPagamentoBO.calcularDiasUteis(hoje.getYear(), hoje.getMonthValue()));

        try {
            FolhaPagamentoBO entity = this.repository.create(FolhaPagamentoMapper.toBO(dto));

            return FolhaPagamentoMapper.toDTO(entity);
        } catch (Exception e) {
            throw new FolhaPagamentoNaoCriada("Não foi possível emitir a folha de pagamento", 500);
        }
    }

}
