package io.github.tinemyumi.tinemyumi_webapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class HelloController{

    @GetMapping("/hello")
    public String helloWorld(){
        return "Olá, mundo.";
    }
    //link do site/rest/hello
}