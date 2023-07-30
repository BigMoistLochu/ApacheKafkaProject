package com.example.apachekafkaproject.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {


    @Bean
    public NewTopic lochuTopic()
    {
        return TopicBuilder.name("lochu")
                .build();
    }


}
