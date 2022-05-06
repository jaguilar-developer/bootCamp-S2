package com.bootcamp.bank.credits.controller;

import com.bootcamp.bank.credits.database.model.Credit;
import com.bootcamp.bank.credits.service.OperationService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/credits")
public class OperationController {

    private final @NonNull OperationService operationService;

    @GetMapping("find-number")
    public Mono<Credit> findByrequestNumber(@RequestParam(name="creditNumber") String creditNumber){
        return operationService.findByrequestNumber(creditNumber);
    }

    @PostMapping("/save")
    public Mono<Credit> saveCredit(@RequestBody Credit credit){
        return operationService.saveCredit(credit);
    }

    @PutMapping("/update")
    public Mono<Credit> updateCredit(@RequestBody Credit credit){
        return operationService.updateCredit(credit);
    }
}
