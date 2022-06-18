package com.prog3.prog3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prog3.prog3.entity.Film;
import com.prog3.prog3.repository.IFilmRepository;

@Service
public class FilmsService {
	
	@Autowired
	IFilmRepository filmRepo;
	
	public Film createFilm(Film film) {
		return filmRepo.save(film);
	}
	
	public List<Film> getFilms(){
		return filmRepo.findAll();
	}
	
	public void deleteFilm(Long id) {
		filmRepo.deleteById(id);
	}
}
