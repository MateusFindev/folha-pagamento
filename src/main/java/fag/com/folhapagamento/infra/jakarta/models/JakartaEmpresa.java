package fag.com.folhapagamento.infra.jakarta.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "empresa")
public class JakartaEmpresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cnpj", nullable = false, unique = true)
    private String cnpj;

    @Column(name = "razao_social", nullable = false)
    private String razaoSocial;

    @Column(name = "nome_fantasia", nullable = false)
    private String nomeFantasia;

    @Column(name = "endereco")
    private String endereco;

    @Column(name = "regime_tributario")
    private String regimeTributario;

    @Column(name = "inscricao_estadual")
    private String inscricaoEstadual;

    @Column(name = "inscricao_municipal")
    private String inscricaoMunicipal;

    @OneToMany(mappedBy = "empresa", fetch = FetchType.LAZY)
    private List<JakartaContrato> contratos = new ArrayList<>();

    @OneToMany(mappedBy = "empresa", fetch = FetchType.LAZY)
    private List<JakartaDepartamento> departamentos = new ArrayList<>();

}
