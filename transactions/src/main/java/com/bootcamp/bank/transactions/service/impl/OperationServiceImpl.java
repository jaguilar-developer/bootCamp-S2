package com.bootcamp.bank.transactions.service.impl;

import org.springframework.stereotype.Service;
import com.bootcamp.bank.transactions.database.model.Transaction;
import com.bootcamp.bank.transactions.database.repository.TransactionRepository;
import com.bootcamp.bank.transactions.service.OperationService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Slf4j
@Service
@RequiredArgsConstructor
public class OperationServiceImpl implements OperationService{
	
	final private @NonNull TransactionRepository transactionRepository;
	
	@Override
	public Mono<Transaction> findBynumOpe(String numOpe) {
		
		return transactionRepository.findBynumOpe(numOpe);
	}

	@Override
	public Mono<Transaction> saveTransaction(Transaction transactions) {
		return transactionRepository.save(transactions);
	}
	

}
