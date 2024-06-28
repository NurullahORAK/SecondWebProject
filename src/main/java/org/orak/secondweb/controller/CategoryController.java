package org.orak.secondweb.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categories")

public class CategoryController {
    @GetMapping     // Bu method kayıt edilen veriyi tek tek id sine göre db den çekmek için kullanılır
    public String getCategory() {
        return "Category";
    }

    @PostMapping    //Bu method ilk defa kaydetmek için kullanılır
    public String postCategory() {
        return " Category is posted";
    }

    @DeleteMapping  //Bu method silmek için kullanılır
    public String deleteCategory() {
        return "Category is deleted";
    }

    @PutMapping     // Bu method güncelleme için kullanılır
    public String putCategory() {
        return "Category is putted";
    }
}
