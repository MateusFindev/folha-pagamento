package fag.com.folhapagamento.infra.jakarta.models;

import fag.com.folhapagamento.core.enums.EnumCategoriaSegurado;
import fag.com.folhapagamento.core.enums.EnumTipoContrato;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "contrato")
public class JakartaContrato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo")
    private EnumTipoContrato tipo;

    @Column(name = "carga_horaria", nullable = false)
    private Integer cargaHoraria;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_filiacao", nullable = false)
    private EnumCategoriaSegurado tipoFiliacao;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cargo", nullable = false)
    private JakartaCargo cargo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_empresa", nullable = false, insertable = false)
    private JakartaEmpresa empresa;

    @OneToOne(mappedBy = "contrato")
    private JakartaColaborador colaborador;

}
