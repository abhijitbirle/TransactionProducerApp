package com.mywork.begin.transactiondataproducerapp.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

@EnableConfigurationProperties
@Component
@PropertySource("classpath:application.properties")
@ConfigurationProperties(prefix = "kafka")
@Getter
@Setter
public class ApplicationProperties {

    private String clientId;

    private String servers;

    private String port;

    private String acks;

    private List<String> kafkaTopics;
}
