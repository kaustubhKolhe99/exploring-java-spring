package com.jpa.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.jpa.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    
}
