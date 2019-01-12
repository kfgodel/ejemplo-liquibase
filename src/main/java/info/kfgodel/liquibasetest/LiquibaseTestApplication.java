package info.kfgodel.liquibasetest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiquibaseTestApplication {
	public static Logger LOG = LoggerFactory.getLogger(LiquibaseTestApplication.class);

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(LiquibaseTestApplication.class, args);
		LOG.info("Iniciado, simulando actividad");
		Thread.sleep(5000);
		LOG.info("Finalizado. Terminando app");
	}

}

