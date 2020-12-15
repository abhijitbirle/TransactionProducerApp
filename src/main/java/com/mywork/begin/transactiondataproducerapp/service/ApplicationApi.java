package com.mywork.begin.transactiondataproducerapp.service;

import com.mywork.begin.transactiondataproducerapp.config.ApplicationProperties;
import com.mywork.begin.transactiondataproducerapp.kafka.TransactionProducer;
import com.mywork.begin.transactiondataproducerapp.model.Transaction;
import com.mywork.begin.transactiondataproducerapp.repository.RepositoryImpl.MongoDbRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequestMapping("/api/")
public class ApplicationApi {

    @Autowired
    private MongoDbRepository mongoDbRepository;

    @Autowired
    private ApplicationProperties applicationProperties;

    @Autowired
    private TransactionProducer transactionProducer;

    @PostMapping("postTransaction")
    public String postTransaction(@RequestBody Transaction transaction) {
        mongoDbRepository.addTransaction(transaction);
        transactionProducer.sendToKafkaTopic(transaction);
        return "Transaction is inserted";
    }
}
