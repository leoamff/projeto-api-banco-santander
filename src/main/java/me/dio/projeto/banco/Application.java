package me.dio.projeto.banco;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Sua API", version = "1.0", description = "Descrição da sua API"))

public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
