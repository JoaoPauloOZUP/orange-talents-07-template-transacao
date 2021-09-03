package br.com.zupacademy.joao.transacao.kafka_listeners.dto;

import br.com.zupacademy.joao.transacao.model.Transacao;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransacaoInput {

    private String id;

    private BigDecimal valor;

    private EstabelecimentoInput estabelecimento;

    private CartaoInput cartao;

    private LocalDateTime efetivadaEm;

    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    public TransacaoInput(@JsonProperty("id") String id,
                          @JsonProperty("valor") BigDecimal valor,
                          @JsonProperty("estabelecimento") EstabelecimentoInput estabelecimento,
                          @JsonProperty("cartao") CartaoInput cartao,
                          @JsonProperty("efetivadaEm") LocalDateTime efetivadaEm) {

        this.id = id;
        this.valor = valor;
        this.estabelecimento = estabelecimento;
        this.cartao = cartao;
        this.efetivadaEm = efetivadaEm;
    }

    public Transacao toTransacao() {
        return new Transacao(id, valor, estabelecimento.toEstabelecimento(), cartao.toCartao(), efetivadaEm);
    }
}
