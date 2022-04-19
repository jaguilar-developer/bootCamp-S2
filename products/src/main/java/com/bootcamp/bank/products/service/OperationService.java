package com.bootcamp.bank.products.service;

import com.bootcamp.bank.products.database.model.Products;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface OperationService {

    Flux<Products> findAllProduct();
    Mono<Products> saveProduct(Products products);
    Mono<Products> updateProduct(Products products);
}
