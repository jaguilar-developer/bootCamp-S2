package com.bootcamp.bank.wallets.service;

import com.bootcamp.bank.wallets.database.model.Wallet;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface OperationService {

	Flux<Wallet> findAllWallet();
	Mono<Wallet> saveWallet(Wallet wallet);
}
