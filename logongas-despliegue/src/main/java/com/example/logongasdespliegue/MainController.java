package com.example.logongasdespliegue;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class MainController {

    @GetMapping("")
    public String sayHello(){
        return "Hello World, soy el puto amo ";
    }
}
