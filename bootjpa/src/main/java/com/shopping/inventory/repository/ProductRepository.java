package com.shopping.inventory.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopping.inventory.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
  List<Product> findByName(String  name);

  List<Product> findByBrand(String brand);
}