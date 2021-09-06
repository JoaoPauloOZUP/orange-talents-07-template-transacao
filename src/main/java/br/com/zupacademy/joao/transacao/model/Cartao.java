package br.com.zupacademy.joao.transacao.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
public class Cartao {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @NotNull
    @NotBlank
    private String numeroCartao;

    @NotNull
    @NotBlank
    private String email;

    @Deprecated
    private Cartao() {
    }

    public Cartao(String numeroCartao, String email) {
        this.numeroCartao = numeroCartao;
        this.email = email;
    }
}
