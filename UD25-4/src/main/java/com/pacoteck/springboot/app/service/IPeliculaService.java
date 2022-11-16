package com.pacoteck.springboot.app.service;

import java.util.List;
import com.pacoteck.springboot.app.dto.Pelicula;

public interface IPeliculaService {

	public void create(Pelicula entity);
	public List<Pelicula> listAll();
	public void update(Pelicula entity);
	public void deleteById(int id);
}
