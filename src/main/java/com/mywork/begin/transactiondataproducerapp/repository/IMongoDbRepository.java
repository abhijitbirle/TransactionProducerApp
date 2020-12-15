package com.mywork.begin.transactiondataproducerapp.repository;

import com.mywork.begin.transactiondataproducerapp.model.TransactionEvent;

import java.util.List;

public interface IMongoDbRepository {

    List<TransactionEvent> getAllTransaction();

    void addTransaction(TransactionEvent transaction);
}
