package io.github.tinemyumi.tinemyumi_webapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("helloPage")
public class HelloController {

    @GetMapping("hello")
    public String helloWorld(){
        return "Avanti Palestra";
    }
}
