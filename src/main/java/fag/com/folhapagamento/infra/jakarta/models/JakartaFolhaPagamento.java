package fag.com.folhapagamento.infra.jakarta.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

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

    @Column(name = "salario_bruto")
    private BigDecimal salarioBruto;

    @Column(name = "salario_liquido")
    private BigDecimal salarioLiquido;

    @Column(name = "mes")
    private String mes;

    @Column(name = "dias_uteis")
    private Integer diasUteis;

}
