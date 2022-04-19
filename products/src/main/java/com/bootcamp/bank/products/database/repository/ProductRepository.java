package com.bootcamp.bank.products.database.repository;

import com.bootcamp.bank.products.database.model.Products;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductRepository extends ReactiveMongoRepository<Products,String> {
}
