package br.com.zupacademy.joao.transacao.repository;

import br.com.zupacademy.joao.transacao.model.Estabelecimento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstabelecimentoRepository extends JpaRepository<Estabelecimento, Long> {
}
