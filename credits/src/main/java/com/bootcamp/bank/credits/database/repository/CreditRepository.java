package com.bootcamp.bank.credits.database.repository;

import com.bootcamp.bank.credits.database.model.Credit;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface CreditRepository extends ReactiveMongoRepository<Credit,String> {

    Mono<Credit> findByrequestNumber(String requestNumber);

}
