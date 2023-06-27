package com.example.crudexample.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class UserController {

    @GetMapping("/")
    public String 메인화면(){
        return "home";
    }

    @GetMapping("/{name}")
    public String 인사(@PathVariable("name") String name, Model model){
        model.addAttribute("name",name);
        return "home";
    }


}
