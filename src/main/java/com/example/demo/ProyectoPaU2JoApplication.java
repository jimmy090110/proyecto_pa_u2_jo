package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.modelo.Profesor;
import com.example.demo.uce.service.IEstudianteService;
import com.example.demo.uce.service.IProfesorService;

@SpringBootApplication
public class ProyectoPaU2JoApplication implements CommandLineRunner {

	@Autowired
	private IEstudianteService estudianteService;
	
	@Autowired
	private IProfesorService profesorService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2JoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Estudiante estu= new Estudiante();
		//estu.setId(1);
		//estu.setNombre("Jimmy");
		//estu.setApellido("Ortega");
		//estu.setCedula("1234567890");
		//estu.setCiudad("Quito");
		//estu.setGenero("Masculino");
		//this.estudianteService.agregar(estu);
		
		//estu.setNombre("Gabriel");
		//estu.setCedula("0987654321");
		//estu.setCiudad("Cuenca");
		//this.estudianteService.modificar(estu);
		
		//estu.setNombre("Gabriel");
		//estu.setCedula("09854321");
		//estu.setCiudad("Cuenca");
		//this.estudianteService.modificar(estu);
		//Estudiante estu2 = this.estudianteService.buscar(2);
		//System.out.println(estu2);
	
		//estu.setId(4);
		//this.estudianteService.eliminar(4);
		Profesor prof = new Profesor();
		prof.setId(1);
		prof.setNombre("Agustin");
		prof.setApellido("Torres");
		prof.setEdad(35);
		this.profesorService.insertar(prof);
	
		
	}

}
