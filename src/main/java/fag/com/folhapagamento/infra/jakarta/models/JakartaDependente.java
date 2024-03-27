package fag.com.folhapagamento.infra.jakarta.models;

import fag.com.folhapagamento.core.enums.EnumParentesco;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "dependente")
public class JakartaDependente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "nascimento", nullable = false)
    private Date nascimento;

    @Enumerated(EnumType.STRING)
    @Column(name = "parentesco", nullable = false)
    private EnumParentesco parentesco;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_colaborador", nullable = false)
    private JakartaColaborador colaborador;

}
