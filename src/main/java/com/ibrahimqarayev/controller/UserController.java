package com.ibrahimqarayev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/index")
    public String home() {
        return "index";
    }
}
