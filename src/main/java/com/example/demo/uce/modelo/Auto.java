package com.example.demo.uce.modelo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="auto")
public class Auto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "aut_seq")
	@SequenceGenerator(name = "aut_seq",sequenceName = "aut_seq",allocationSize = 1)
	@Column(name="aut_id")
	private Integer id;
	
	@Column(name="aut_marca")
	private String marca;

	@OneToOne(mappedBy = "auto" ,cascade = CascadeType.ALL)
	private Motor motor;
	
	
	
	@Override
	public String toString() {
		return "Auto [id=" + id + ", marca=" + marca + ", motor=" + motor + "]";
	}

	//GET AND SET
	public Integer getId() {
		return id;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	
	

}
