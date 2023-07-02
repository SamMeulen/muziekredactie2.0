package be.radioscorpio.muziekredactie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class MuziekredactieApplication {

	public static void main(String[] args) {
		SpringApplication.run(MuziekredactieApplication.class, args);
	}

}
