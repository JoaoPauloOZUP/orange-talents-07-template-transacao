package br.com.zupacademy.joao.transacao.kafka_listeners;

import br.com.zupacademy.joao.transacao.model.Transacao;
import br.com.zupacademy.joao.transacao.kafka_listeners.dto.TransacaoInput;
import br.com.zupacademy.joao.transacao.repository.TransacaoRepository;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TransacaoListener {

    @Autowired
    private TransacaoRepository transacaoRepository;

    @KafkaListener(topics = "${TOPIC_NAME}", groupId = "${GROUP_ID}", containerFactory = "kafkaListenerContainerFactory")
    public void consume(ConsumerRecord<String, TransacaoInput> record) {
        TransacaoInput input = record.value();
        Transacao transacao = input.toTransacao();
        transacaoRepository.save(transacao);
    }
}
