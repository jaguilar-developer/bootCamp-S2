package com.bootcamp.bank.transactions.service;

import com.bootcamp.bank.transactions.database.model.Transaction;
import reactor.core.publisher.Mono;

public interface OperationService {
	
	Mono<Transaction> findBynumOpe(String numOpe);
	Mono<Transaction> saveTransaction(Transaction transaction);

}
