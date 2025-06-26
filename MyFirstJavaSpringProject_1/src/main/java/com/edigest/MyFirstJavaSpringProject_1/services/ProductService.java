package com.edigest.MyFirstJavaSpringProject_1.services;

import com.edigest.MyFirstJavaSpringProject_1.exceptions.ProductNotFoundException;
import com.edigest.MyFirstJavaSpringProject_1.models.Product;

public interface ProductService {
    public Product getProductById(long id) throws ProductNotFoundException;
}
