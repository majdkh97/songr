package com.example.songr;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class capitalize {

    @GetMapping("/capitalize/{sentence}")
    @ResponseBody
    public String capitalize(@PathVariable("sentence") String sentence) {
        String upperCase = sentence.toUpperCase();
        return upperCase;
    }
}
