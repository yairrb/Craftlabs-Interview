package com.productos.controller;

import com.productos.model.Product;
import com.productos.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {


    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }



    @GetMapping(path = "/api/product")
    public ResponseEntity<List<Product>> listProducts () {
        List<Product> ps = this.service.getProducts();

        return ResponseEntity.ok(ps);
    }

    @GetMapping(path = "/api/product/discounts")
    public ResponseEntity<List<Product>> getDiscountProducts (){
        List<Product> ps = this.service.getProductsWithDiscount();

        ps.stream().forEach(p -> p.getProductName());
        return ResponseEntity.ok(ps);
    }
}