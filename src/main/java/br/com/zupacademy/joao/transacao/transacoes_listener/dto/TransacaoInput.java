package br.com.zupacademy.joao.transacao.transacoes_listener.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransacaoInput {

    private String id;

    private BigDecimal valor;

    private EstabelecimentoInput estabelecimento;

    private CartaoInput cartao;

    private LocalDateTime efetivadaEm;

    public TransacaoInput(String id, BigDecimal valor, EstabelecimentoInput estabelecimento, CartaoInput cartao, LocalDateTime efetivadaEm) {
        this.id = id;
        this.valor = valor;
        this.estabelecimento = estabelecimento;
        this.cartao = cartao;
        this.efetivadaEm = efetivadaEm;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public EstabelecimentoInput getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(EstabelecimentoInput estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public CartaoInput getCartao() {
        return cartao;
    }

    public void setCartao(CartaoInput cartao) {
        this.cartao = cartao;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }

    public void setEfetivadaEm(LocalDateTime efetivadaEm) {
        this.efetivadaEm = efetivadaEm;
    }
}
