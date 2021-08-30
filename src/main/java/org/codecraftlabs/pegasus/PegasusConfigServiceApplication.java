package org.codecraftlabs.pegasus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PegasusConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PegasusConfigServiceApplication.class, args);
	}

}
