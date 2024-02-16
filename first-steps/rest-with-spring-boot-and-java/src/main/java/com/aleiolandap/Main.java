package com.aleiolandap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
		validacaoNumerica n = new validacaoNumerica();
		//System.out.println("Resultado do is numeric:" + n.isNumeric("8"));
	}

}
