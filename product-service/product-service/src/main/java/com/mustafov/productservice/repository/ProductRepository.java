package com.mustafov.productservice.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.mustafov.productservice.model.Product;



public interface ProductRepository extends MongoRepository<Product, String> {
}

