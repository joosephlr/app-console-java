package com.iniciante.java.appConsoleJava;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppConsoleJavaApplication {

	public static void main(String[] args) {
		//SpringApplication.run(AppConsoleJavaApplication.class, args);

		var text = "Hello, World! I'm the best Java developer in the world!";
		String border = "=".repeat(text.length());

		System.out.println(border);
		System.out.println(text);
		System.out.println(border);

	}

}
