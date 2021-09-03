package br.com.zupacademy.joao.transacao.repository;

import br.com.zupacademy.joao.transacao.model.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TransacaoRepository extends JpaRepository<Transacao, Long> {
}
