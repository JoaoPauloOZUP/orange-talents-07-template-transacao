package br.com.zupacademy.joao.transacao.kafka_listeners.dto;

import br.com.zupacademy.joao.transacao.model.Cartao;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CartaoInput {

    private String id;

    private String email;

    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    public CartaoInput(@JsonProperty("id") String id,
                       @JsonProperty("email") String email) {
        this.id = id;
        this.email = email;
    }

    public Cartao toCartao() {
        return new Cartao(id, email);
    }
}
