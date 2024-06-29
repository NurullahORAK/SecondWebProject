package org.orak.secondweb.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {
    @GetMapping
    public String getProduct() {
        return "Product";
    }

    @PostMapping
    public String postProduct() {
        return "Product is posted";
    }

    @DeleteMapping
    public String deleteProduct() {
        return "Product is deleted";
    }

    @PutMapping
    public String putProduct() {
        return "Product is updated";
    }
}
