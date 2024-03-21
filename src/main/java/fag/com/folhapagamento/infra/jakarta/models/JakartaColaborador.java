package fag.com.folhapagamento.infra.jakarta.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "colaborador")
public class JakartaColaborador {

    @Column(name = "cpf", nullable = false)
    private String cpf;

    @Column(name = "rg")
    private String rg;

    @Column(name = "cnh")
    private String cnh;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "admissao", nullable = false)
    private Date admissao;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_contrato", nullable = false)
    private JakartaContrato contrato;

    @Column(name = "dependentes")
    private Integer dependentes;

}
