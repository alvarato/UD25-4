package com.pacoteck.springboot.app.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name ="peliculas")
public class Pelicula {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="edad")
	private int edad;
	
	@OneToMany(mappedBy = "pelicula", cascade = CascadeType.ALL)
	private List<Sala> sala;
	
	public Pelicula() {}

	public Pelicula(int codigo, String nombre, int edad, List<Sala> sala) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.edad = edad;
		this.sala = sala;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@JsonIgnore
	public List<Sala> getSala() {
		return sala;
	}

	public void setSala(List<Sala> sala) {
		this.sala = sala;
	}
	
	
}
