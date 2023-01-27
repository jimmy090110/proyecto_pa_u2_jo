package com.example.demo.uce.modelo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="ciudadano")
public class Ciudadano {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "ciu_seq")
	@SequenceGenerator(name = "ciu_seq",sequenceName = "ciu_seq",allocationSize = 1)
	@Column(name="ciu_id")
	private Integer id;
	
	@Column(name="ciu_nombre")
	private String nombre;
	
	@Column(name="ciu_apellido")
	private String apellidO;
	
	@OneToOne(mappedBy = "ciudadano", cascade = CascadeType.ALL)
	private Empleado empleado;
	
	
	//SET AND GET

	public Integer getId() {
		return id;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
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

	public String getApellidO() {
		return apellidO;
	}

	public void setApellidO(String apellidO) {
		this.apellidO = apellidO;
	}
	
	

}
