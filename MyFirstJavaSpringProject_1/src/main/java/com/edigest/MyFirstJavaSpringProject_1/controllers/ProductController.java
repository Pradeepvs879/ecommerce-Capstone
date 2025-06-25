package com.edigest.MyFirstJavaSpringProject_1.controllers;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping("/{productID}")
    public ResponseEntity<String> getProductById(@PathVariable("productID") int productId){
        System.out.println("Product ID: "+productId);
        return new ResponseEntity<>("productId "+productId, HttpStatusCode.valueOf(200));
    }
}
