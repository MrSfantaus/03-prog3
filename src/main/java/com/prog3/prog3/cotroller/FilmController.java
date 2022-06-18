package com.prog3.prog3.cotroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prog3.prog3.entity.Film;
import com.prog3.prog3.service.FilmsService;


@RestController
@RequestMapping("films")
public class FilmController {

	@Autowired
	FilmsService filmsService;
	
	@PostMapping
	public void createFilm(@RequestBody Film film) {
		filmsService.createFilm(film);
	}
	
	
}
