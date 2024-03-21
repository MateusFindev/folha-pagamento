package fag.com.folhapagamento.infra.jakarta.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "desconto")
public class JakartaBeneficio {

    @Id
    @Column(name = "codigo", nullable = false)
    private String codigo;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "valorPadrao")
    private BigDecimal valorPadrao;

    @Column(name = "ativo")
    private boolean ativo;

}
