package com.Exit.oscarmarket;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/saludar")
public class controller {
@GetMapping("/hola")
    public  String holamundo(){
        return  "Hola Hope";
    }
}

