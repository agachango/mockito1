package dinjection.guru.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

/**
 * Created by anthony on 11/09/2016.
 */
@Controller
@Profile("spanish")
public class HelloWorldSpanishImpl  implements HelloWorldService{
    @Override
    public String getGreetings() {
        return "Hola Mundo!";
    }
}
