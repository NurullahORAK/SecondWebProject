package org.orak.secondweb.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")  // RequestMapping in içerisine / koyduktan sonra Entity nin adı gelir.
public class UserController {
    @GetMapping
    public String getUser() {
        return "Controller";
    }

    @PostMapping
    public String postUser() {
        return "Controller is posted";
    }

    @DeleteMapping
    public String deleteUser() {
        return "Controller is deleted";
    }

    @PutMapping
    public String putUser() {
        return "Controloler updated";
    }
}
