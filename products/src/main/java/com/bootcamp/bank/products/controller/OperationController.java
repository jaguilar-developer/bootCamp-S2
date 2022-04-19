package com.bootcamp.bank.products.controller;

import com.bootcamp.bank.products.database.model.Products;
import com.bootcamp.bank.products.service.OperationService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/products")
public class OperationController {

    private final @NonNull OperationService operationService;

    @GetMapping("/find")
    public Flux<Products> findAllProduct(){
        return operationService.findAllProduct();
    }

    @PostMapping("/save")
    public Mono<Products> saveProduct(@RequestBody Products products){
        return operationService.saveProduct(products);
    }

    @PutMapping("/update")
    public Mono<Products> updateProduct(@RequestBody Products products){
        return operationService.updateProduct(products);
    }


}
