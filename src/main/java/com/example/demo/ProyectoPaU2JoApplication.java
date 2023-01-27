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
import com.example.demo.uce.modelo.Colegio;
import com.example.demo.uce.modelo.Empleado;
import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.modelo.Habitacion;
import com.example.demo.uce.modelo.Hotel;
import com.example.demo.uce.modelo.Motor;
import com.example.demo.uce.repository.IMotorRepo;
import com.example.demo.uce.service.IAutoService;
import com.example.demo.uce.service.ICiudadanoService;
import com.example.demo.uce.service.IColegioService;
import com.example.demo.uce.service.IEmpleadoService;
import com.example.demo.uce.service.IEstudianteService;
import com.example.demo.uce.service.IHabitacionService;
import com.example.demo.uce.service.IHotelService;
import com.example.demo.uce.service.IMotorService;

@SpringBootApplication
public class ProyectoPaU2JoApplication implements CommandLineRunner {

	
	

	
	@Autowired 
	private IColegioService colegioService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2JoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
	
	//Agregar
	List<Estudiante>estudiantelist = new ArrayList<>();
	Colegio col = new Colegio();
	col.setNombre("Eugenio Espejo");
	
	Estudiante estu = new Estudiante();
	Estudiante estu2 = new Estudiante();
	estu.setNombre("Juan Perez");
	estu2.setNombre("Gabriel Cortez");
	estu.setColegio(col);
	estu2.setColegio(col);
	estudiantelist.add(estu);
	estudiantelist.add(estu2);
	
	col.setEstudiantes(estudiantelist);
	
	this.colegioService.agregar(col);
	
	//Actualizar
	col.setNombre("Tecnico Sigsig");
	this.colegioService.modificar(col);
	
	//Buscar
	Colegio col3 = this.colegioService.buscar(4);
	//for (Estudiante estu3 : col.getEstudiantes()) {
	//System.out.println(estu3);
	//}
	
	//Eliminar
	col.setId(3);
	this.colegioService.eliminar(3);
	

	}

}
