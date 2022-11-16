package com.pacoteck.springboot.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pacoteck.springboot.app.dao.IPeliculaDAO;
import com.pacoteck.springboot.app.dto.Pelicula;

@Service
public class PeliculaServiceImp implements IPeliculaService{

	@Autowired
	IPeliculaDAO dao;

	@Override
	public void create(Pelicula entity) {
		dao.save(entity);
		
	}

	@Override
	public List<Pelicula> listAll() {
		return dao.findAll();
	}

	@Override
	public void update(Pelicula entity) {
		List<Pelicula> aux = dao.findAll();
		for (Pelicula pelicula : aux) {
			if(pelicula.getCodigo() == entity.getCodigo()) {
				dao.save(entity);
			}
		}
	}

	@Override
	public void deleteById(int id) {
		dao.deleteById(id);
		
	}
}
