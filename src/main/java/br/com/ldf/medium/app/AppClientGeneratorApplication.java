package br.com.ldf.medium.app;

import br.com.ldf.medium.integration.HousesApi;
import br.com.ldf.medium.integration.SpellsApi;
import br.com.ldf.medium.integration.WizardsApi;
import br.com.ldf.medium.model.SpellType;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
@RequiredArgsConstructor
public class AppClientGeneratorApplication implements CommandLineRunner {

	private final HousesApi housesApi;

	public static void main(String[] args) {
		SpringApplication.run(AppClientGeneratorApplication.class, args);
	}

	@Override
	public void run(String... args) {
		log.info("Getting houses from Hogwarts...");
		var responseHouses = housesApi.housesGet(new Object());
		log.info(responseHouses.toString());
	}
}
