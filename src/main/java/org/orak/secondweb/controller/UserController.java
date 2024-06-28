package org.orak.secondweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")  // RequestMapping in içerisine / koyduktan sonra Entity nin adı gelir.
public class UserController {
    @RequestMapping("/get")
    public String getUser(){
        return "User";
    }
}
