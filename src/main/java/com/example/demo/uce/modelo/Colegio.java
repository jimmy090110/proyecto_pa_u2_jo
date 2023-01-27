package com.example.demo.uce.modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="colegio")
public class Colegio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "col_seq")
	@SequenceGenerator(name="col_seq", sequenceName = "col_seq",allocationSize = 1)
	@Column(name="hote_id")
	private Integer id;
	
	@Column(name="col_nombre")
	private String nombre;
	
	@OneToMany(mappedBy = "colegio",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<Estudiante>estudiantes;

	
	
	
	@Override
	public String toString() {
		return "Colegio [id=" + id + ", nombre=" + nombre + ", estudiantes=" + estudiantes + "]";
	}
	
	//Get and Set

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

	public List<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(List<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}
	

}
