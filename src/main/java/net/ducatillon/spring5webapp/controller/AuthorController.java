package net.ducatillon.spring5webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.ducatillon.spring5webapp.repositories.AuthorRepository;

@Controller
public class AuthorController {

	AuthorRepository authorRepository;

	public AuthorController(AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
	}

	@RequestMapping("/authors")
	public String getAuthorsList(Model model) {

		model.addAttribute("authors", authorRepository.findAll());

		return "authors";
	}

}
