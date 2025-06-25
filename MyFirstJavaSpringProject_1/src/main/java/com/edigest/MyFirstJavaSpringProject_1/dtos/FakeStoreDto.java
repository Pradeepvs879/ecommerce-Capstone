package com.edigest.MyFirstJavaSpringProject_1.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreDto {
    long id;
    String title;
    double price;
    String description;
    String category;
    String image;
}
