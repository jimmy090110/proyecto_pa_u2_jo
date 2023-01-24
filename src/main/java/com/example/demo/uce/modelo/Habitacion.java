package com.example.demo.uce.modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name= "habitacion")
public class Habitacion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "habi_seq")
	@SequenceGenerator(name = "habi_seq",sequenceName = "habi_seq",allocationSize = 1)
	@Column(name = "hote_id")
	private Integer id;
	
	@Column(name = "hote_numero")
	private String numero;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "habi_id_hotel")
	private Hotel hotel;

	
	


	//Set and Get
	public Integer getId() {
		return id;
		
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	

}
