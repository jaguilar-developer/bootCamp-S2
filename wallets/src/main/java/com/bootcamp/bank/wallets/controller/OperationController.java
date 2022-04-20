package com.bootcamp.bank.wallets.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.bank.wallets.database.model.Wallet;
import com.bootcamp.bank.wallets.service.OperationService;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/wallets")
public class OperationController {
	
	private final @NonNull OperationService operationService;
	
	@GetMapping("/find")
	public Flux<Wallet> findWalletAll(){
		return operationService.findAllWallet();
	}
	
	@PostMapping("/save")
	public Mono<Wallet> saveWallet(@RequestBody Wallet wallet){
		return operationService.saveWallet(wallet);
	}

}
