package com.bootcamp.bank.wallets.service.impl;

import org.springframework.stereotype.Service;

import com.bootcamp.bank.wallets.database.model.Wallet;
import com.bootcamp.bank.wallets.database.repository.WalletRepository;
import com.bootcamp.bank.wallets.service.OperationService;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@Service
@RequiredArgsConstructor
public class OperationServiceImpl implements OperationService{

	private final @NonNull WalletRepository walletRepository;

	@Override
	public Flux<Wallet> findAllWallet() {
		return walletRepository.findAll();
	}
	
	@Override
	public Mono<Wallet> saveWallet(Wallet wallet) {
		return walletRepository.save(wallet);
	}

	
	
}
