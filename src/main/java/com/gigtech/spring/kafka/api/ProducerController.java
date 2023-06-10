package com.gigtech.spring.kafka.api;

import com.gigtech.spring.kafka.api.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class ProducerController {

    @Autowired
    private KafkaTemplate<String, Object> template;

    @Value("${kafka.topic}")
    private String topic;

    @GetMapping("/publish/{message}")
    public String publishMessage(@PathVariable String message) {
        template.send(topic, "Hi " + message + " Welcome to gigtech!!  As always most of you have come to class without doing hands on. ");
        return "Data published to Kafka Topic.. !!";
    }

    @PostMapping("/publishJson")
    public String publishMessage(@RequestBody User user) {
        template.send(topic, user);
        return "Json Data published";
    }

}
