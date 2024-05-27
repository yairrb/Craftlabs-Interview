package com.productos;

import com.productos.controller.ProductController;
import com.productos.model.Product;
import com.productos.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@SpringBootTest()
public class ProductControllerTest {


    @Mock
    private ProductService service;

    @InjectMocks
    private ProductController controller;


    @Test
    public void productsWithEmptyListTest(){

        Mockito.when(service.getProducts()).thenReturn(Collections.emptyList());

        Assertions.assertEquals(controller.listProducts().getBody(), Collections.emptyList());
        Assertions.assertTrue(controller.listProducts().getBody().isEmpty());
    }


}
