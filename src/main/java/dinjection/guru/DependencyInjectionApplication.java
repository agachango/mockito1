package dinjection.guru;

import dinjection.guru.controllers.GreetingsController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
	  ApplicationContext ctx= SpringApplication.run(DependencyInjectionApplication.class, args);
		GreetingsController controller=(GreetingsController) ctx.getBean("greetingsController");
		controller.sayHello();
	}
}
