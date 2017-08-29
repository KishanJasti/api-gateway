
package io.jasti.kishan.helloservice.controller;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping
    public String hello(@RequestHeader("x-location") String location){
        return "hello from " + location + "!";
    }

}
