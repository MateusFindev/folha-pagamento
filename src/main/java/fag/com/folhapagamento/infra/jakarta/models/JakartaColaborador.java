package fag.com.folhapagamento.infra.jakarta.models;

import fag.com.folhapagamento.core.enums.EnumGenero;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "colaborador")
public class JakartaColaborador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cpf", nullable = false)
    private String cpf;

    @Column(name = "rg")
    private String rg;

    @Column(name = "cnh")
    private String cnh;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "email", nullable = false)
    private String email;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "admissao", nullable = false)
    private Date admissao = new Date();

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_contrato", nullable = false)
    private JakartaContrato contrato;

    @Column(name = "genero")
    @Enumerated(EnumType.STRING)
    private EnumGenero genero;

    @OneToMany(mappedBy = "colaborador", fetch = FetchType.LAZY)
    private List<JakartaDependente> dependentes = new ArrayList<>();

    @OneToMany(mappedBy = "colaborador", fetch = FetchType.LAZY)
    private List<JakartaColaboradorBeneficio> beneficios = new ArrayList<>();

    @OneToMany(mappedBy = "colaborador", fetch = FetchType.LAZY)
    private List<JakartaColaboradorDesconto> descontos = new ArrayList<>();

}
