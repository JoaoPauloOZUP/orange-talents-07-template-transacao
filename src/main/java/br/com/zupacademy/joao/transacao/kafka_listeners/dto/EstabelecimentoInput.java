package br.com.zupacademy.joao.transacao.kafka_listeners.dto;

import br.com.zupacademy.joao.transacao.model.Estabelecimento;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EstabelecimentoInput {

    private String nome;

    private String cidade;

    private String endereco;

    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    public EstabelecimentoInput(@JsonProperty("nome") String nome,
                                @JsonProperty("cidade") String cidade,
                                @JsonProperty("endereco") String endereco) {
        this.nome = nome;
        this.cidade = cidade;
        this.endereco = endereco;
    }

    public Estabelecimento toEstabelecimento() {
        return new Estabelecimento(nome, cidade, endereco);
    }
}
