package com.edigest.MyFirstJavaSpringProject_1.services;

import com.edigest.MyFirstJavaSpringProject_1.dtos.FakeStoreDto;
import com.edigest.MyFirstJavaSpringProject_1.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FakeStoreProductService implements ProductService{

    RestTemplate restTemplate = new RestTemplate();
    @Override
    public Product getProductById(long id) {
        String url = "https://fakestoreapi.com/products/"+id;
        FakeStoreDto fakeStoreDto = restTemplate.getForObject(url, FakeStoreDto.class);
        return convertFakeStoreDtoToProduct(fakeStoreDto);
    }
    private Product convertFakeStoreDtoToProduct(FakeStoreDto fakeStoreDto){
        Product product = new Product();
        product.setName(fakeStoreDto.getTitle());
        product.setCategory(fakeStoreDto.getCategory());
        product.setDescription(fakeStoreDto.getDescription());

        return product;
    }
}
