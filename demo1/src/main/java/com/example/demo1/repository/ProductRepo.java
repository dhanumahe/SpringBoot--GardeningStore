package com.example.demo1.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
// import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo1.model.Product;



public interface ProductRepo extends JpaRepository<Product,Integer>{
    @Query("SELECT p FROM Product p WHERE p.productId = :productId")
Product findByName(@Param("productId")Integer productId);
}