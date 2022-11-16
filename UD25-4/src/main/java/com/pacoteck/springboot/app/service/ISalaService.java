package com.pacoteck.springboot.app.service;

import java.util.List;

import com.pacoteck.springboot.app.dto.Sala;

public interface ISalaService {

	public void create(Sala entity);
	public List<Sala> listAll();
	public void update(Sala entity);
	public void deleteById(int id);
}
