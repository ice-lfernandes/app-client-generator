package br.com.ldf.medium.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppClientGeneratorApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AppClientGeneratorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}
}
