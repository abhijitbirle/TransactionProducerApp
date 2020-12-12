package com.mywork.begin.TransactionDataProducerApp.repository;

import com.mywork.begin.TransactionDataProducerApp.model.Transaction;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface IMongoDbRepository {

    List<Transaction> getAllTransaction();

    void addTransaction(Transaction transaction);
}
