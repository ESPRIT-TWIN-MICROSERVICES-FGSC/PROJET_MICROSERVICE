package esprit.fgsc.PROJETMICROSERVICES;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProjetMicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetMicroservicesApplication.class, args);
	}

}
