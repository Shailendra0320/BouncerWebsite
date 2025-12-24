package com.project.Bodyguard.ConrollerBodyguard;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BodyController {

    @GetMapping("/home")
    private String hello(String s){
        return "hello jii ham fir aa gaaye ";
    }
}
