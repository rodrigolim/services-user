package br.com.sansys.services.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.sansys.services.user.config.infra.kafka.KafkaConfiguration;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(KafkaConfiguration.class)
public class StartUser {

	public static void main(String[] args) {
		SpringApplication.run(StartUser.class, args);
	}

}
