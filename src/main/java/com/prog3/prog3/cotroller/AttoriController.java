package com.prog3.prog3.cotroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prog3.prog3.entity.Attore;
import com.prog3.prog3.entity.Film;
import com.prog3.prog3.service.AttoriService;
import com.prog3.prog3.service.FilmsService;

@RestController
@RequestMapping("/attori")
public class AttoriController {

	@Autowired
	AttoriService attoriService;
	
	@Autowired
	FilmsService filmsService;
	
	@GetMapping
	public List<Attore> getAttori(){
		return attoriService.getAttori();
	}
	
	@PostMapping
	public void createAttore(@RequestBody Attore attore) {
		attoriService.createAttore(attore);
	}
	
	@GetMapping("/{id}")
	public Attore getAttoreById(@PathVariable Long id) {
		return attoriService.getAttoreById(id);
	}
	
	@PostMapping("/{id}/film")
	public void createFilm4Attore(@RequestBody Film film, @PathVariable Long id) {
		attoriService.createFilm4Attore(film, id);
	}

}
