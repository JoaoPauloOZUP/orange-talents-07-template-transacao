package br.com.zupacademy.joao.transacao.controller.dto;

import br.com.zupacademy.joao.transacao.model.Transacao;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransacaoResponse {

    private String idTransacao;

    private BigDecimal valor;

    private LocalDateTime efetivadaEm;

    public TransacaoResponse(Transacao transacao) {
        this.idTransacao = transacao.getId();
        this.valor = transacao.getValor();
        this.efetivadaEm = transacao.getEfetivadaEm();
    }

    public String getIdTransacao() {
        return idTransacao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }
}
