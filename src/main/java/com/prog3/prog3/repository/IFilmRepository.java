package com.prog3.prog3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prog3.prog3.entity.Film;

public interface IFilmRepository extends JpaRepository<Film, Long> {

}
