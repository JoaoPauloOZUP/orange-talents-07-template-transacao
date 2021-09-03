package br.com.zupacademy.joao.transacao.transacoes_listener;

import br.com.zupacademy.joao.transacao.transacoes_listener.dto.TransacaoInput;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TransacaoListener {

    @KafkaListener(topics = "${TOPIC_NAME}", groupId = "${GROUP_ID}")
    public void consume(ConsumerRecord<String, TransacaoInput> record) {
        System.out.println("Consumi");
        System.out.println("Consumi");
        System.out.println("Consumi");
        System.out.println("Consumi");
        System.out.println("Consumi");
        System.out.println("Consumi");
        System.out.println("Consumi");
        System.out.println("Consumi");
        System.out.println("Consumi");
    }
}
