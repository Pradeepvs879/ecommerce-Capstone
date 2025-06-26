package com.edigest.MyFirstJavaSpringProject_1.controllers;

import com.edigest.MyFirstJavaSpringProject_1.exceptions.ProductNotFoundException;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class SampleController {

    @GetMapping("/{name}")
    public String sayHello(@PathVariable("name") String abc){
        String message = abc+" is telling hi to "+abc;
        System.out.println(message);
        return message;
    }

    @GetMapping("/hello")
    public String say(){
        System.out.println("Hello Pradeep");
        return "Hello World";
    }

    @GetMapping("/film/{filmName}/{userId}")
    public String bookingSeat(@PathVariable("filmName")String filmName, @PathVariable("userId") int userId){
        String message = filmName+" is at 6 pm and is booked to user with id "+userId;
        return message;
    }

    @GetMapping("/pradeep/sde/{number}")
    public ResponseEntity<String> exceptionIssue(@PathVariable("number") int number) throws ProductNotFoundException{
        if(number < 5){
            throw new ProductNotFoundException("Hi this exception ha ha ha..");
        }
        String result = "Hi "+number+" how are you";
        return new ResponseEntity<>(result,HttpStatusCode.valueOf(200));
    }
}
