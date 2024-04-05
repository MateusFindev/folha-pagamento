package fag.com.folhapagamento.infra.jakarta.models;

import fag.com.folhapagamento.core.enums.EnumMes;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "colaborador_ponto")
public class JakartaColaboradorPonto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_colaborador", nullable = false)
    private JakartaColaborador colaborador;

    @Column(name = "dias_trabalhados", nullable = false)
    private Integer diasTrabalhados;

    @Column(name = "faltas", nullable = false)
    private Integer faltas;

    @Column(name = "horas_atraso", nullable = false)
    private Integer horasAtraso;

    @Column(name = "horas_50", nullable = false)
    private Integer horas50;

    @Column(name = "horas_100", nullable = false)
    private Integer horas100;

    @Enumerated(EnumType.STRING)
    @Column(name = "mes", nullable = false)
    private EnumMes mes;

}
