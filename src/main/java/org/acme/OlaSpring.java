package org.acme;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ola-spring")
public class OlaSpring {

    @GetMapping
    public String olaSpring(){
        return "Springboot no Quarkus?";
    }
    
}