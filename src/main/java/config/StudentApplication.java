package config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScans(value = { @ComponentScan("boot.entry"),
	      @ComponentScan("Model"),
	      @ComponentScan("Controller"),
	      @ComponentScan("DAO"),
	      @ComponentScan("Miscallaneous"),
	      @ComponentScan("Service"),
	      @ComponentScan("config")})
public class StudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
	}

}
