package br.com.fiap.filmes.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.filmes.model.Filmes;

@Controller
public class FilmesController {
	@GetMapping("/filmes")
	public ModelAndView index() {
		ModelAndView modelView = new ModelAndView ("filmes/index");
		Filmes filme01 = new Filmes( "Titanic", 12, 1998, "Romance", "James Cameron", "EUA");
		Filmes filme02 = new Filmes( "Avatar", 12, 2009, "Ação", "James Cameron", "EUA");
		Filmes filme03 = new Filmes( "Frozen", 0, 2003, "Animação", "Chris Buck", "EUA");
		
		List<Filmes>filmes = java.util.Arrays.asList(filme01, filme02, filme03);
		modelView.addObject("listarFilmes", filmes);
		
		return modelView;
	}

	
	
	
}
