package com.rex.kafka.demo.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "rex-topic", groupId = "rex-group")
    public void listenGroup(String message) {
        System.out.println("Received Message in group rex-group: " + message);
    }
}