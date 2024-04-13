package fag.com.folhapagamento.infra.jakarta.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "colaborador_desconto")
public class JakartaColaboradorDesconto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_colaborador", nullable = false)
    private JakartaColaborador colaborador;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_desconto", nullable = false)
    private JakartaDesconto desconto;

    @Column(name = "valor", precision = 10, scale = 3, nullable = false)
    private BigDecimal valor = BigDecimal.ZERO;

    @Column(name = "ativo", nullable = false)
    private boolean ativo;

}
