package com.miProyecto.NeftChat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.miProyecto.repository")
public class NeftChatApplication {

	public static void main(String[] args) {
		SpringApplication.run(NeftChatApplication.class, args);
	}

}
