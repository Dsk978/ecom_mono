package com.example.ecommerce.repository;


import org.springframework.data.jpa.repository.JpaRepository;



import com.example.ecommerce.entity.Product;
//import java.util.List;

//import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
}