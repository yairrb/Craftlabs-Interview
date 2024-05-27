package com.productos.service;


import com.productos.model.Product;
import com.productos.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.PrimitiveIterator;

@Service
public class ProductService {

    private final String discountOn = "Cleaning";


    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }


    public List<Product> getProductsWithDiscount(){
        return this.repository.findProductByCategory(this.discountOn);
    }

    public List<Product> getProducts() {
        return (List<Product>) this.repository.findAll();
    }

}
