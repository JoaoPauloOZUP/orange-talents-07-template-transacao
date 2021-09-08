package br.com.zupacademy.joao.transacao.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Cartao {

    @Id
    private String id;

    @NotNull
    @NotBlank
    private String email;

    @Deprecated
    private Cartao() {
    }

    public Cartao(String numeroCartao, String email) {
        this.id = numeroCartao;
        this.email = email;
    }

    public String getId() {
        return id;
    }
}
