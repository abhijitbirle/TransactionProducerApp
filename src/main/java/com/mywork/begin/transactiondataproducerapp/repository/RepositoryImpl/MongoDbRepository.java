package com.mywork.begin.transactiondataproducerapp.repository.RepositoryImpl;

import com.mywork.begin.transactiondataproducerapp.model.Transaction;
import com.mywork.begin.transactiondataproducerapp.repository.IMongoDbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Document("transaction")
@Component
public class MongoDbRepository implements IMongoDbRepository {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Transaction> getAllTransaction() {
        return mongoTemplate.findAll(Transaction.class);
    }

    @Override
    public void addTransaction(Transaction transaction) {
        mongoTemplate.insert(transaction);
    }
}
