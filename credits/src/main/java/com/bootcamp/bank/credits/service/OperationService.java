package com.bootcamp.bank.credits.service;

import com.bootcamp.bank.credits.database.model.Credit;
import reactor.core.publisher.Mono;

public interface OperationService {

    Mono<Credit> saveCredit(Credit credit);
    Mono<Credit> updateCredit(Credit credit);
    Mono<Credit> findByrequestNumber(String requestNumber);
}
