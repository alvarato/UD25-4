package com.pacoteck.springboot.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pacoteck.springboot.app.dto.Sala;
import com.pacoteck.springboot.app.service.SalaServiceImp;

@RestController
@RequestMapping("/salas")
public class SalaController {

	@Autowired
	SalaServiceImp imp;
	
	@GetMapping("/findAll")
	public List<Sala> findAll(){
		return imp.listAll();
	}
	
	@DeleteMapping("/delte{id}")
	public void deleteById(@PathVariable("id") int id) {
		imp.deleteById(id);
	}
	
	@PutMapping("/create")
	public void create(@RequestBody Sala entity) {
		imp.create(entity);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody Sala entity) {
		imp.update(entity);
	}
}
