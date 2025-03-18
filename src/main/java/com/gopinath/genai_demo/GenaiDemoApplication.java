package com.gopinath.genai_demo;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GenaiDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GenaiDemoApplication.class, args);
	}

	/*@Bean
	public CommandLineRunner runner(ChatClient.Builder builder) {
		return args -> {
			ChatClient chatClient = builder.build();
			String response = chatClient.prompt("What is Spring Boot").call().content();
			System.out.println(response);
		};
	}*/
}
