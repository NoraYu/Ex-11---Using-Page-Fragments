package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("/contact")
    public String contactPage(){
        return "contact";
    }
    @RequestMapping("/about")
    public String aboutPage(){
        return "about";
    }
}
