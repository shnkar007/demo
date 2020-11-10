package com.training;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/demo")
public class DemoController {
    @Get("/")
    public String greet(){
        return "Welcome to Micronaut";
    }
}
