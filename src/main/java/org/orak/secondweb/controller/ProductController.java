package org.orak.secondweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
    @RequestMapping("/get")
    public String getUser(){
        return "Product";
    }
}
