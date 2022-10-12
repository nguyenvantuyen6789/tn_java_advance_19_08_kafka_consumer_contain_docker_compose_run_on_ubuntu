package com.tn.kafkatopic;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaTopic {

    @KafkaListener(topics = "testTopic", groupId = "group-id")
    public void kafkaTestTopic(String message) {
        System.out.println("Message: " + message);
    }

}
