package dinjection.guru.controllers;

import dinjection.guru.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by anthony on 11/09/2016.
 */
@Controller
public class GreetingsController {
    private HelloWorldService helloWorldService;

    @Autowired
    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public String sayHello(){
        String greetings = helloWorldService.getGreetings();
        System.out.println(greetings);
        return greetings;

    }
}
