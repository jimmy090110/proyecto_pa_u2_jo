package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Auto;
import com.example.demo.uce.modelo.Ciudadano;
import com.example.demo.uce.modelo.Empleado;
import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.modelo.Habitacion;
import com.example.demo.uce.modelo.Hotel;
import com.example.demo.uce.modelo.Motor;
import com.example.demo.uce.repository.IMotorRepo;
import com.example.demo.uce.service.IAutoService;
import com.example.demo.uce.service.ICiudadanoService;
import com.example.demo.uce.service.IEmpleadoService;
import com.example.demo.uce.service.IEstudianteService;
import com.example.demo.uce.service.IHabitacionService;
import com.example.demo.uce.service.IHotelService;
import com.example.demo.uce.service.IMotorService;

@SpringBootApplication
public class ProyectoPaU2JoApplication implements CommandLineRunner {

	
	
	@Autowired
	private IAutoService autoService;
	
	@Autowired 
	private IMotorService motorService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2JoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//Insertar
		Auto aut = new Auto();
		aut.setMarca("Chevrolet");
		
		Motor mot = new Motor();
		mot.setDescripcion("V8");
		aut.setMotor(mot);
		mot.setAuto(aut);
		
		
		this.autoService.agregar(aut);
		this.motorService.agregar(mot);
		
		//Actualizar
		
		aut.setMarca("Mazda");
		mot.setDescripcion("v6");
		this.autoService.modificar(aut);
		this.motorService.modificar(mot);
		
		//Buscar
		Auto aut2 = this.autoService.buscar(1);
		System.out.println(aut2);
		
		//Eliminar
		aut.setId(1);
		this.autoService.eliminar(1);
	
			
	
	
	}

}
