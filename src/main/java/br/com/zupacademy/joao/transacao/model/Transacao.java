package br.com.zupacademy.joao.transacao.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
public class Transacao {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @NotNull
    @NotBlank
    private String idTransacao;

    @NotNull
    private BigDecimal valor;

    @OneToOne(cascade = CascadeType.PERSIST)
    @NotNull
    private Estabelecimento estabelecimento;

    @OneToOne(cascade = CascadeType.PERSIST)
    @NotNull
    private Cartao cartao;

    @NotNull
    private LocalDateTime efetivadaEm;

    @Deprecated
    private Transacao() {
    }

    public Transacao(String idTransacao, BigDecimal valor, Estabelecimento estabelecimento, Cartao cartao, LocalDateTime efetivadaEm) {
        this.idTransacao = idTransacao;
        this.valor = valor;
        this.estabelecimento = estabelecimento;
        this.cartao = cartao;
        this.efetivadaEm = efetivadaEm;
    }

    public String getIdTransacao() {
        return idTransacao;
    }
}
