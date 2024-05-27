package com.productos.repository;

import com.productos.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository  extends CrudRepository<Product, Long> {

    public List<Product> findProductByCategory(String category);



}
