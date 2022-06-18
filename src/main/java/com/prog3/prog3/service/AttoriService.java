package com.prog3.prog3.service;

import java.util.Arrays;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prog3.prog3.entity.Attore;
import com.prog3.prog3.entity.Film;
import com.prog3.prog3.repository.IAttoreRepository;

@Service
public class AttoriService {

	@Autowired
	IAttoreRepository attoreRepo;
	
	@Autowired
	FilmsService filmsService;
	
	public void createAttore(Attore attore) {
		attoreRepo.save(attore);
	}
	
	public List<Attore> getAttori(){
		return attoreRepo.findAll();
	}
	
	public void deleteAttore(Long id) {
		attoreRepo.deleteById(id);
	}
	
	public Attore getAttoreById(Long id) {
		return attoreRepo.findById(id).get();
	}

	public void createFilm4Attore(Film filmDTO, Long id) {
	//	Film film = filmsService.createFilm(filmDTO);
		Attore attore = getAttoreById(id);
		
		attore.getFilms().add(filmDTO);
		createAttore(attore);
	}
}
/*
 *CREARE UN SERVIZIO CHE ASSOCI FILM AD ATTORE
 */
 
