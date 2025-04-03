package com.mvp.TrainingCenterRegistryMvp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.mvp.model")
@ComponentScan(basePackages = "com.mvp")
@EnableJpaRepositories(basePackages = "com.mvp.repository")
@EntityScan(basePackages = "com.mvp.model") 
public class TrainingCenterRegistryMvpApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainingCenterRegistryMvpApplication.class, args);
	}
}
