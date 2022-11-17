package com.dmitry.NewsClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class NewsClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewsClientApplication.class, args);
	}

}
