package com.example.crudProductAgroTech.repositories;
import com.example.crudProductAgroTech.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository <Product, String> { }





