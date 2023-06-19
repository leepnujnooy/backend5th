package com.example.crudexample.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class UserController {

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/{name}")
    public String greeting(@PathVariable("name") String name, Model model){
        model.addAttribute("name",name);
        return "home";
    }


}
