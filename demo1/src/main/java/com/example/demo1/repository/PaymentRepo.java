package com.example.demo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo1.model.Payment;

public interface PaymentRepo extends JpaRepository<Payment,Integer>{
    
}