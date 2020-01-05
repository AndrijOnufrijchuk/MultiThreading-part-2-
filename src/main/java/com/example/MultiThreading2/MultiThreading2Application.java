package com.example.MultiThreading2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MultiThreading2Application {

	public static void main(String[] args) {
		SpringApplication.run(MultiThreading2Application.class, args);
		Chat m = new Chat();
		new T1(m);
		new T2(m);

	}

}
