package com.sovanroth.demo.service;

import com.sovanroth.demo.enities.ProductEntity;
import com.sovanroth.demo.repositories.ProductRepository;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductServiceImp implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImp(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ProductEntity createProduct(ProductEntity request) {
        try {
            productRepository.save(request);
            return request;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public List<ProductEntity> getAllProducts() {

        try {
            return productRepository.findAll();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public List<ProductEntity> searchByName(String name) {
        try {

            List<ProductEntity> res = productRepository.findByNameContainingIgnoreCase(name);
            return res;
        } catch (Exception e) {
            throw e;
        }
    }
}
