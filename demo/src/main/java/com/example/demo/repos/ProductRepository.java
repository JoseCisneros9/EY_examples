package com.example.demo.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
