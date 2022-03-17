package br.com.fiap.filmes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"br.com.fiap.filmes.controller"})
public class FilmesApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilmesApplication.class, args);
	}

}
