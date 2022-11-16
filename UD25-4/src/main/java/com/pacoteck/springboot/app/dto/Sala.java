package com.pacoteck.springboot.app.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="salas")
public class Sala {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	
	@Column(name="nombre")
	private String nombre;
	
	@ManyToOne()
	@JoinColumn(name="pelicula")
	private Pelicula pelicula;

	public Sala() {}
	
	public Sala(int codigo, String nombre, Pelicula pelicula) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.pelicula = pelicula;
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

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}
	
	
}
