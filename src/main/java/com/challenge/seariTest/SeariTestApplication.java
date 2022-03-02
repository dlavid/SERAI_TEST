package com.challenge.seariTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.challenge.seariTest.model.Pizza;
import com.challenge.seariTest.repository.PizzaRepository;
import org.springframework.context.ConfigurableApplicationContext;
import java.io.*;

@SpringBootApplication
public class SeariTestApplication {

	public static void main(String[] args) {

		SpringApplication.run(SeariTestApplication.class, args);

	}

}
