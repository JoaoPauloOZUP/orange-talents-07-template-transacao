package br.com.zupacademy.joao.transacao.controller;

import br.com.zupacademy.joao.transacao.controller.dto.TransacaoResponse;
import br.com.zupacademy.joao.transacao.model.Cartao;
import br.com.zupacademy.joao.transacao.model.Transacao;
import br.com.zupacademy.joao.transacao.repository.CartaoRepository;
import br.com.zupacademy.joao.transacao.repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
public class TransacaoController {

    @Autowired
    private TransacaoRepository transacaoRepository;

    @Autowired
    private CartaoRepository cartaoRepository;

    @GetMapping("/transacao/{id}")
    private ResponseEntity<?> getTransacao(@PathVariable("id") String numeroCartao) {
        if(numeroCartao == null || numeroCartao.isBlank()) {
            return ResponseEntity.badRequest().build();
        }

        Optional<Cartao> possivelCartao = cartaoRepository.findById(numeroCartao);

        if(possivelCartao.isPresent()) {
            List<Transacao> listaTransacoes = transacaoRepository.findFirst10ByCartaoIdOrderByEfetivadaEmDesc(numeroCartao);

            List<TransacaoResponse> responses = listaTransacoes.stream().map(TransacaoResponse::new).collect(Collectors.toList());
            return ResponseEntity.ok(responses);
        }

        return ResponseEntity.notFound().build();
    }
}
