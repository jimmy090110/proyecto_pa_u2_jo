package com.example.demo.uce.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="profesor")
public class Profesor {
	
	@Id
	@Column(name= "prof_id")
	private Integer id;
	
	@Column(name= "prof_nombre")
	private String nombre;
	
	@Column(name= "prof_apellido")
	private String apellido;
	
	@Column(name= "prof_cedula")
	private String cedula;
	
	@Column(name= "prof_genero")
	private String genero;
	
	@Column(name= "prof_edad")
	private Integer edad;
	
	
	//SET AND GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	
}
