package com.example.songr;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class helloWorld {

    @GetMapping("/hello")
    public String hello(){
        return "helloWorld.html";
    }
}
