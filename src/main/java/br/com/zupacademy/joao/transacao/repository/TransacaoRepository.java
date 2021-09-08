package br.com.zupacademy.joao.transacao.repository;

import br.com.zupacademy.joao.transacao.model.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransacaoRepository extends JpaRepository<Transacao, Long> {
    List<Transacao> findFirst10ByCartaoIdOrderByEfetivadaEmDesc(String numeroCartao);
}
