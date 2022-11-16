package com.pacoteck.springboot.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pacoteck.springboot.app.dto.Pelicula;

public interface IPeliculaDAO extends JpaRepository<Pelicula, Integer>{

}
