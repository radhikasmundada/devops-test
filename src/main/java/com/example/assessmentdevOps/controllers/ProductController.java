package com.example.assessmentdevOps.controllers;

import com.example.assessmentdevOps.model.Product;
import com.example.assessmentdevOps.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @Autowired
    public ProductRepository productRepository;

    @GetMapping("")
    public List<Product> getProducts() {
        return  productRepository.findAll();
    }

}
