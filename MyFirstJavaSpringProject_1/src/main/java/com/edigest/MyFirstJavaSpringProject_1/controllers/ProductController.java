package com.edigest.MyFirstJavaSpringProject_1.controllers;

import com.edigest.MyFirstJavaSpringProject_1.exceptions.ProductNotFoundException;
import com.edigest.MyFirstJavaSpringProject_1.models.Product;
import com.edigest.MyFirstJavaSpringProject_1.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/{productID}")
    public ResponseEntity<Product> getProductById(@PathVariable("productID") int productId) throws ProductNotFoundException {
//        if(productId < 1 || productId > 20){
//            System.out.println("The id is not valid");
//            return new ResponseEntity<>(HttpStatusCode.valueOf(400));
//        }
        Product product = productService.getProductById(productId);
        return new ResponseEntity<>(product, HttpStatusCode.valueOf(200));
    }
}
