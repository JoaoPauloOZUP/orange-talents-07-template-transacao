package br.com.zupacademy.joao.transacao.kafka_listeners;

import br.com.zupacademy.joao.transacao.kafka_listeners.dto.TransacaoInput;
import br.com.zupacademy.joao.transacao.model.Transacao;
import br.com.zupacademy.joao.transacao.repository.CartaoRepository;
import br.com.zupacademy.joao.transacao.repository.EstabelecimentoRepository;
import br.com.zupacademy.joao.transacao.repository.TransacaoRepository;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionException;

@Component
public class TransacaoListener {

    private final Logger logger = LoggerFactory.getLogger(TransacaoListener.class);

    @Autowired
    private TransacaoRepository transacaoRepository;

    @KafkaListener(topics = "${TOPIC_NAME}", groupId = "${GROUP_ID}", containerFactory = "kafkaListenerContainerFactory")
    public void consume(ConsumerRecord<String, TransacaoInput> record) {
        TransacaoInput input = record.value();
        Transacao transacao = input.toTransacao();

        try {
            transacaoRepository.save(transacao);
        } catch(TransactionException exception) {
            logger.error("Erro no momento de persistencia. ERRO={}, CAUSA={}", exception.getMessage(), exception.getCause().getMessage());
        }

        logger.info("Transacao salva. TRANSACAO_ID={}", transacao.getId());
    }
}
