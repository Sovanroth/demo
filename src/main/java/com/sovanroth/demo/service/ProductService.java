package com.sovanroth.demo.service;

import com.sovanroth.demo.enities.ProductEntity;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface ProductService {

    ProductEntity createProduct(ProductEntity request);
    List<ProductEntity> getAllProducts();
    List<ProductEntity> searchByName(String name);
}
