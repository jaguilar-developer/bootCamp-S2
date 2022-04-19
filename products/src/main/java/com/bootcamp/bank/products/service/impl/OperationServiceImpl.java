package com.bootcamp.bank.products.service.impl;

import com.bootcamp.bank.products.database.model.Products;
import com.bootcamp.bank.products.database.repository.ProductRepository;
import com.bootcamp.bank.products.service.OperationService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@Service
@RequiredArgsConstructor
public class OperationServiceImpl implements OperationService {

    private final @NonNull ProductRepository productRepository;

    @Override
    public Flux<Products> findAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Mono<Products> saveProduct(Products products) {
        return productRepository.save(products);
    }

    @Override
    public Mono<Products> updateProduct(Products products) {
        return productRepository.findById(products.getId()).map(p -> {
            productRepository.save(products).subscribe();
            return products;
        });
    }
}
