package fag.com.folhapagamento.infra.jakarta.models;

import fag.com.folhapagamento.core.enums.EnumGenero;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "colaborador")
public class JakartaColaborador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cpf", nullable = false, unique = true)
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cargo", nullable = false)
    private JakartaCargo cargo;

    @Column(name = "genero")
    @Enumerated(EnumType.STRING)
    private EnumGenero genero;

}
