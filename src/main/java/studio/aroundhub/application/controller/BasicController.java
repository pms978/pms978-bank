package studio.aroundhub.application.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    public String hello(){
        return "hello";
    }

}
