package com.coffee_shop.backend.dao;

import com.coffee_shop.backend.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
