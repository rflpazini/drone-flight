package com.escale.dojo.falcon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FalconApplication {

	public static void main(String[] args) {
		SpringApplication.run(FalconApplication.class, args);
		System.out.println("Falcon is on air...");
	}

	public static int Solution(int a, int b) {
		return a + b;
	}
}
