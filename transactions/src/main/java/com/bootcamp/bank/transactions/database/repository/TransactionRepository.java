package com.bootcamp.bank.transactions.database.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import com.bootcamp.bank.transactions.database.model.Transaction;

import reactor.core.publisher.Mono;

public interface TransactionRepository extends ReactiveMongoRepository<Transaction,String>{

	Mono<Transaction> findBynumOpe(String numOpe);
}
