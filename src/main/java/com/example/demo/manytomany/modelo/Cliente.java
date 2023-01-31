package com.example.demo.manytomany.modelo;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name ="cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cli")
	@SequenceGenerator(name = "seq_cli",sequenceName = "seq_cli",allocationSize = 1)
	@Column(name ="cli_id")
	private Integer id;
	
	@Column(name ="cli_nombre")
	private String nombre;
	
	@Column(name ="cli_apellido")
	private String apellido;
	
	@Column(name ="cli_cedula")
	private String cedula;
	
	@Column(name ="cli_tarjeta")
	private String numTarjeta;

	@ManyToMany(mappedBy = "clientes",cascade = CascadeType.ALL)
	
	private Set<Vehiculo> vehiculos;
	//SET y GET
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

	public String getNumTarjeta() {
		return numTarjeta;
	}

	public void setNumTarjeta(String numTarjeta) {
		this.numTarjeta = numTarjeta;
	}

	public Set<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(Set<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}
	
	
	
	

}
