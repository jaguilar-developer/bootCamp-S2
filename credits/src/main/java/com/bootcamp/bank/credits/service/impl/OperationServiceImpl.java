package com.bootcamp.bank.credits.service.impl;


import com.bootcamp.bank.credits.database.model.Credit;
import com.bootcamp.bank.credits.database.repository.CreditRepository;
import com.bootcamp.bank.credits.service.OperationService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class OperationServiceImpl implements OperationService {

    private final @NonNull CreditRepository creditRepository;


    @Override
    public Mono<Credit> saveCredit(Credit credit) {
        return creditRepository.save(credit);
    }

    @Override
    public Mono<Credit> updateCredit(Credit credit) {
        return creditRepository.findByrequestNumber(credit.getRequestNumber())
                .map(c -> {
                    credit.setId(c.getId());
                    creditRepository.save(credit).subscribe();
                    return credit;
                });
    }

    @Override
    public Mono<Credit> findByrequestNumber(String requestNumber) {
        return creditRepository.findByrequestNumber(requestNumber);
    }
}
