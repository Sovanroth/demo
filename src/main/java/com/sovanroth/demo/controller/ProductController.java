package com.sovanroth.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sovanroth.demo.enities.ProductEntity;
import com.sovanroth.demo.service.ProductService;

@RestController
@RequestMapping(value = {"ABC", "ABL"})
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService poProductService) {
        this.productService = poProductService;
    }

    @GetMapping("PING")
    public ResponseEntity<String> ping() {
        return ResponseEntity.ok("PING");
    }

    @PostMapping("CRATED12")
        public ResponseEntity<ProductEntity> createProduct(@RequestBody ProductEntity product) {
        ProductEntity created = productService.createProduct(product);
        return ResponseEntity.ok(created);
    }

    @GetMapping("GETALL12")
        public ResponseEntity<List<ProductEntity>> getAllProduct() {
        List<ProductEntity> list = productService.getAllProducts();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/search")
    public ResponseEntity<List<ProductEntity>> searchProducts(@RequestParam("name") String name) {
        List<ProductEntity> results = productService.searchByName(name);
        return ResponseEntity.ok(results);
    }
}
