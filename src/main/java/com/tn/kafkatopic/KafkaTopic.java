package com.tn.kafkatopic;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaTopic {

    @KafkaListener(topics = "testTopic", groupId = "group-id")
    public void kafkaTestTopic(String message) throws JsonProcessingException {
        System.out.println("Message: " + message);
//        ObjectMapper objectMapper = new ObjectMapper();
//        Student student = objectMapper.readValue(message, Student.class);
//        System.out.println("student");
//        System.out.println(student);
    }

}
