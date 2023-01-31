package com.example.demo.manytomany.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name= " vehiculo")

//PRINCIPAL
public class Vehiculo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_vehi")
	@SequenceGenerator(name= "seq_vehi",sequenceName = "seq_vehi",allocationSize = 1)
	@Column(name ="vehi_id")
	private Integer id;
	
	@Column(name ="vehi_marca")
	private String marca;
	
	@Column(name ="vehi_modelo")
	private String modelo;
	
	@Column(name ="vehi_valor")
	private BigDecimal valor;
	
	@Column(name ="vehi_tipo")
	private String tipo;

	@ManyToMany
	@JoinTable(
	name ="vehiculo_cliente",  //NOMBRE TABLA ROMPIMIENTO
	joinColumns=@JoinColumn(name="vehicli_id_vehiculo"), //COLUMNA PK DEL VEHICULO
	inverseJoinColumns = @JoinColumn(name= "vehicli_id_cliente")//COLUMNA PK AUTOR
	)
	private Set<Cliente> clientes;

	//SET y GET
	public Integer getId() {
		return id;
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

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Set<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}
	

}
