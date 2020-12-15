package com.mywork.begin.transactiondataproducerapp.config;

import com.mywork.begin.transactiondataproducerapp.model.Transaction;
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
    public ProducerFactory<String, Transaction> producerFactory() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(
                ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, applicationProperties.getServers() + ":" +
                        applicationProperties.getPort());
        configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, Serdes.String().getClass().getName());
        configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, Transaction.class);
        return new DefaultKafkaProducerFactory<>(configProps);
    }

    @Bean
    public KafkaTemplate<String, Transaction> kafkaTemplate() {
        return new KafkaTemplate<>(producerFactory());
    }

  /*  public Properties getProducerProperties() {
        Properties properties = new Properties();
        properties.setProperty(ProducerConfig.CLIENT_ID_CONFIG, applicationProperties.getClientId());
        properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, applicationProperties.getServers() + ":" +
                applicationProperties.getPort());
        properties.setProperty(ProducerConfig.ACKS_CONFIG, applicationProperties.getAcks());
        properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, Serdes.String().getClass().getName());
        properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, Serdes.String().getClass().getName());
        return properties;
    }*/
}
