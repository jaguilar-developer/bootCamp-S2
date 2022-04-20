package com.bootcamp.bank.transactions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.bank.transactions.database.model.Transaction;
import com.bootcamp.bank.transactions.service.OperationService;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/transactions")
public class OperationController{
	
	private final @NonNull OperationService operationService;
	
	@GetMapping("/find-numope")
	public Mono<Transaction> findBynumOpe(@RequestParam(name = "numOpe") String numOpe){
		return operationService.findBynumOpe(numOpe);
	}
	
	@PostMapping("/save")
	public Mono<Transaction> saveTransaction(@RequestBody Transaction transaction){
		return operationService.saveTransaction(transaction);
	}
	
	
}
