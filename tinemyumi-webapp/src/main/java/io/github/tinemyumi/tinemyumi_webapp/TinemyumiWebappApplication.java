package io.github.tinemyumi.tinemyumi_webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class TinemyumiWebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(TinemyumiWebappApplication.class, args);
	}

}
