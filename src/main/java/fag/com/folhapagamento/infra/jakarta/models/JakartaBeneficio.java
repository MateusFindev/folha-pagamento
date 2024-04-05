package fag.com.folhapagamento.infra.jakarta.models;

import fag.com.folhapagamento.core.enums.EnumTipoValor;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "beneficio")
public class JakartaBeneficio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "codigo", nullable = false, unique = true)
    private String codigo;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "valor_padrao")
    private BigDecimal valorPadrao;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_valor", nullable = false)
    private EnumTipoValor tipoValor;

    @Column(name = "ativo")
    private boolean ativo;

}
