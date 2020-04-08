package com.example.demo;

import org.springframework.data.repository.CrudRepository;

/*
기본적인 CRUD POST DELETE PATCH 등이 가능
*/
public interface ProductRepository extends CrudRepository<Product, Long> {
}

