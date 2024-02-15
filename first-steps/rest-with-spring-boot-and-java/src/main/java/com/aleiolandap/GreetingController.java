package com.aleiolandap;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	private static final String template = "Hello, %s!!";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/greeting")
	public Greeting greeting (@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting (counter.incrementAndGet(), String.format(template, name));
	}
	
	//private final AtomicLong counter = new AtomicLong();
	//@RequestMapping("/greeting")
	/*public String index() {
		return "Greetings from SpringBoot!!!";
	}
	public int Numeros() {
		return 2+2;
	}
	Greeting greeting = new Greeting("Alessandra", "Pacheco", 0);*/
	
	
	
	
}
