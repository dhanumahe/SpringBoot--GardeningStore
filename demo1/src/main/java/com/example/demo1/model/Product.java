package com.example.demo1.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Product {
    @Id
    private int productId;
    
    private String proOffer;
    private String proName;
    private double proPrice;
    public Product(int productId, String proOffer, String proName, double proPrice) {
        this.productId = productId;
        this.proOffer = proOffer;
        this.proName = proName;
        this.proPrice = proPrice;
    }
    
    public String getProOffer() {
        return proOffer;
    }
    public void setProOffer(String proOffer) {
        this.proOffer = proOffer;
    }
    public String getProName() {
        return proName;
    }
    public void setProName(String proName) {
        this.proName = proName;
    }
    public double getProPrice() {
        return proPrice;
    }
    public void setProPrice(double proPrice) {
        this.proPrice = proPrice;
    }
    public Product()
    {
        
    }
    @OneToOne(mappedBy = "product",cascade = CascadeType.ALL)
    @JoinColumn(name="fk_add_id")
    @JsonManagedReference
    Payment payment;//obj of secondary table
    public Payment getPayment() {
        return payment;
    }
    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
    
   
}