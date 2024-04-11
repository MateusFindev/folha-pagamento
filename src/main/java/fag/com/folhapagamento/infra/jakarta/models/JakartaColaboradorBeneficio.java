package fag.com.folhapagamento.infra.jakarta.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "colaborador_beneficio")
public class JakartaColaboradorBeneficio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_colaborador", nullable = false)
    private JakartaColaborador colaborador;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_beneficio", nullable = false)
    private JakartaBeneficio beneficio;

    @Column(name = "valor", precision = 10, scale = 3, nullable = false)
    private BigDecimal valor = BigDecimal.ZERO;

    @Column(name = "usar_padrao", nullable = false)
    private boolean usarPadrao;

    @Column(name = "ativo", nullable = false)
    private boolean ativo;

    @ManyToOne(fetch = FetchType.LAZY)
    private JakartaFolhaPagamento folhaPagamento;

}
