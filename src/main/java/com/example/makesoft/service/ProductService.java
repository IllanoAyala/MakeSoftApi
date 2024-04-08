package com.example.makesoft.service;

import com.example.makesoft.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
    void save(Product product);
}
