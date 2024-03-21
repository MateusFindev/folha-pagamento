package fag.com.folhapagamento.infra.jakarta.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "cargo")
public class JakartaCargo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "nivel", nullable = false)
    private Integer nivel;

    @Column(name = "funcao", nullable = false)
    private String funcao;

    @Column(name = "salario_base", nullable = false)
    private BigDecimal salarioBase;

    @Column(name = "ad_periculosidade", nullable = false)
    private boolean adPericulosidade;

    @Column(name = "ad_insalubridade", nullable = false)
    private boolean adInsalubridade;

    @Column(name = "ad_funcao", nullable = false)
    private boolean adFuncao;

    @Column(name = "comissao", nullable = false)
    private boolean comissao;

}
