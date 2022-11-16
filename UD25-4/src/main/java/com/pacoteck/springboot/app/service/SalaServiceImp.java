package com.pacoteck.springboot.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pacoteck.springboot.app.dao.ISalaDAO;
import com.pacoteck.springboot.app.dto.Sala;

@Service
public class SalaServiceImp implements ISalaService{

	@Autowired
	ISalaDAO dao;

	@Override
	public void create(Sala entity) {
		dao.save(entity);
		
	}

	@Override
	public List<Sala> listAll() {
		return dao.findAll();
	}

	@Override
	public void update(Sala entity) {
		List<Sala> aux = dao.findAll();
		for (Sala sala : aux) {
			if(sala.getCodigo() == entity.getCodigo()) {
				dao.save(entity);
			}
		}
		
	}

	@Override
	public void deleteById(int id) {
		dao.deleteById(id);
		
	}
}
