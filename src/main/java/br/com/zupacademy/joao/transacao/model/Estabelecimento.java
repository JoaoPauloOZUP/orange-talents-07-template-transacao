package br.com.zupacademy.joao.transacao.model;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
public class Estabelecimento {

    @Id @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @NotNull @NotBlank
    private String nome;

    @NotNull @NotBlank
    private String cidade;

    @NotNull @NotBlank
    private String endereco;

    @Deprecated
    private Estabelecimento() {
    }

    public Estabelecimento(String nome, String cidade, String endereco) {
        this.nome = nome;
        this.cidade = cidade;
        this.endereco = endereco;
    }
}
