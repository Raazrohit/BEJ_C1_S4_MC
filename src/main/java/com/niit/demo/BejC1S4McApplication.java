package com.niit.demo;

import com.niit.demo.services.MessageService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BejC1S4McApplication {

	private static com.niit.demo.services.MessageService MessageService;

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(BejC1S4McApplication.class, args);
		MessageService = context.getBean("messageService", MessageService.class);
		String message = MessageService.helloWorld();
		System.out.println(message);



	}

}
