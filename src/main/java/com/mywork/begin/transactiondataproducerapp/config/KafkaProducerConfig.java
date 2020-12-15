package com.mywork.begin.transactiondataproducerapp.config;

import com.mywork.begin.transactiondataproducerapp.model.TransactionEvent;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.Serdes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaProducerConfig {

    @Autowired
    private ApplicationProperties applicationProperties;

    @Bean
    public ProducerFactory<String, TransactionEvent> producerFactory() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(
                ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, applicationProperties.getServers() + ":" +
                        applicationProperties.getPort());
        configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, Serdes.String().getClass().getName());
        configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, TransactionEvent.class);
        return new DefaultKafkaProducerFactory<>(configProps);
    }

    @Bean
    public KafkaTemplate<String, TransactionEvent> kafkaTemplate() {
        return new KafkaTemplate<>(producerFactory());
    }

}
