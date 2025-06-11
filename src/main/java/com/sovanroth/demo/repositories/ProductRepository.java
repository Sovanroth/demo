package com.sovanroth.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sovanroth.demo.enities.ProductEntity;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
