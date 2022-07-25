package com.mustafov.productservice.repository;




import org.springframework.data.jpa.repository.JpaRepository;

import com.mustafov.productservice.model.Product;



public interface ProductRepository extends JpaRepository<Product, String> {
}

