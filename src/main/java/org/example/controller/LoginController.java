package org.example.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class LoginController {

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {

        if(username.equals("admin") && password.equals("1234")) {
            return "redirect:/todos";
        }

        return "Invalid Credentials";
    }
}