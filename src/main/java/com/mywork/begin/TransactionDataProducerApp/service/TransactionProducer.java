package com.mywork.begin.TransactionDataProducerApp.service;

import com.mywork.begin.TransactionDataProducerApp.model.Transaction;
import com.mywork.begin.TransactionDataProducerApp.repository.RepositoryImpl.MongoDbRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequestMapping("/api/")
public class TransactionProducer {

    private final MongoDbRepository mongoDbRepository;

    public TransactionProducer(MongoDbRepository mongoDbRepository) {
        this.mongoDbRepository = mongoDbRepository;
    }

    @PostMapping("sendTransaction")
    private String getTransaction(@RequestBody Transaction transaction) {
        mongoDbRepository.addTransaction(transaction);
        return "Transaction is inserted";
    }
}
