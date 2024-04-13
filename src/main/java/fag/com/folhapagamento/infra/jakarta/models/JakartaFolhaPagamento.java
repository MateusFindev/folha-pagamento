package fag.com.folhapagamento.infra.jakarta.models;

import fag.com.folhapagamento.core.enums.EnumMes;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "folha_pagamento")
public class JakartaFolhaPagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_colaborador", nullable = false)
    private JakartaColaborador colaborador;

    @Column(name = "salario_bruto", nullable = false)
    private BigDecimal salarioBruto = BigDecimal.ZERO;

    @Column(name = "salario_liquido", nullable = false)
    private BigDecimal salarioLiquido = BigDecimal.ZERO;

    @Enumerated(EnumType.STRING)
    @Column(name = "mes", nullable = false)
    private EnumMes mes;

    @Column(name = "dias_uteis")
    private Integer diasUteis;

}
