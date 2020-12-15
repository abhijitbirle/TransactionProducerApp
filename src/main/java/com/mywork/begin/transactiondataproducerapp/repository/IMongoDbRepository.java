package com.mywork.begin.transactiondataproducerapp.repository;

import com.mywork.begin.transactiondataproducerapp.model.Transaction;

import java.util.List;

public interface IMongoDbRepository {

    List<Transaction> getAllTransaction();

    void addTransaction(Transaction transaction);
}
