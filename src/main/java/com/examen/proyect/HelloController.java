package com.examen.proyect;//package com.DevOps.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping(value = "/hola")
        String holamundo(){
            return "hola rudy";
    }
}
