package com.example.demo.uce.modelo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="motor")
public class Motor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "mot_seq")
	@SequenceGenerator(name = "mot_seq",sequenceName = "mot_seq",allocationSize = 1)
	@Column(name="mot_id")
	private Integer id;
	
	@Column(name="mot_descripcion")
	private  String descripcion;
	
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="mot_id_auto")
	private Auto auto;
	
	
	
	@Override
	public String toString() {
		return "Motor [id=" + id + ", descripcion=" + descripcion + ", auto=" + auto + "]";
	}


	//Get and Set
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public Auto getAuto() {
		return auto;
	}


	public void setAuto(Auto auto) {
		this.auto = auto;
	}

	
	
	

}
