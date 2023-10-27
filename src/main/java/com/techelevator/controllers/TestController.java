package com.techelevator.controllers;

import com.techelevator.models.Quote;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/greeting")
    public String returnTest(){
        System.out.println("TEST");
        return "Test";
    }

    @PostMapping("/another-test")
    public String returnAnotherTest(@RequestBody Quote quote){
        return quote.getDialog();
    }
}
