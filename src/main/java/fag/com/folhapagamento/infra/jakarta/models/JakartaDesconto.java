package fag.com.folhapagamento.infra.jakarta.models;

import fag.com.folhapagamento.core.enums.EnumPrazo;
import fag.com.folhapagamento.core.enums.EnumTipoDesconto;
import fag.com.folhapagamento.core.enums.EnumTipoValor;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "desconto")
public class JakartaDesconto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "codigo", nullable = false, unique = true)
    private String codigo;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "descricao")
    private String descricao;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_valor", nullable = false)
    private EnumTipoValor tipoValor;

    @Enumerated(EnumType.STRING)
    @Column(name = "prazo", nullable = false)
    private EnumPrazo prazo;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo", nullable = false)
    private EnumTipoDesconto tipoDesconto;

    @Column(name = "ativo")
    private boolean ativo;

}
