package com.bootcamp.bank.wallets.database.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import com.bootcamp.bank.wallets.database.model.Wallet;


public interface WalletRepository extends ReactiveMongoRepository<Wallet,String>{
	
		

}
