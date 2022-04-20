package com.bootcamp.bank.customers.controller;

import com.bootcamp.bank.customers.database.model.Customer;
import com.bootcamp.bank.customers.service.OperationService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/customers")
public class OperationController {

    private final @NonNull OperationService operationService;

    @GetMapping("/find-id")
    public Mono<Customer> findCustomerById(@RequestParam(name = "id") String id) {
        return operationService.findCustomerById(id);
    }

    @GetMapping("/find-number")
    @CircuitBreaker(name="customerService", fallbackMethod="fallbackFindNumber")
    public Mono<Customer> findCustomerByDocNumber(@RequestParam(name = "docNumber") String docNumber) {
        return operationService.findCustomerByDocNumber(docNumber);
    }

    public Mono<Customer> fallbackFindNumber(RuntimeException e){
        return null;
    }

    @PostMapping("/save")
    public Mono<Customer> saveCustomer(@RequestBody Customer customer) {
        return operationService.saveCustomer(customer);
    }

    @PutMapping("/update")
    public Mono<Customer> updateCustomer(@RequestBody Customer customer) {
        return operationService.updateCustomer(customer);
    }

    @DeleteMapping("/delete")
    public Mono<Void> deleteCustomer(@RequestParam(name = "docNumber") String docNumber) {
        return operationService.deleteCustomer(docNumber);
    }


}
