package br.com.zupacademy.joao.transacao.repository;

import br.com.zupacademy.joao.transacao.model.Cartao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartaoRepository extends JpaRepository<Cartao, String> {

}
