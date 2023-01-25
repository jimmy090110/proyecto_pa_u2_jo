package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Ciudadano;
import com.example.demo.uce.modelo.Empleado;
import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.modelo.Habitacion;
import com.example.demo.uce.modelo.Hotel;
import com.example.demo.uce.service.ICiudadanoService;
import com.example.demo.uce.service.IEmpleadoService;
import com.example.demo.uce.service.IEstudianteService;
import com.example.demo.uce.service.IHabitacionService;
import com.example.demo.uce.service.IHotelService;

@SpringBootApplication
public class ProyectoPaU2JoApplication implements CommandLineRunner {

	@Autowired
	private IEstudianteService estudianteService;
	
	@Autowired
	private ICiudadanoService ciudadanoService;
	
	@Autowired
	private IEmpleadoService empleadoService;
	
	@Autowired
	private IHotelService hotelService;
	
	@Autowired
	private IHabitacionService habitacionService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2JoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//Estudiante estu= new Estudiante();
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
		
		//Ciudadano ciu = new Ciudadano();
		//ciu.setNombre("Jimmy");
		//ciu.setApellidO("ortega");
		
		//Empleado empl = new Empleado();
		//empl.setSalario(new BigDecimal(20));
		//empl.setFechaIngreso(LocalDateTime);
		//empl.setCiudadano(ciu);
		//this.estudianteService.agregar();
		
		//Estudiante estu2 = this.estudianteService.buscar(2);
		//System.out.println(estu2);
	
		//estu.setId(4);
		//this.estudianteService.eliminar(4);
		
		//CIUDADANO
		//Ciudadano ciu = new Ciudadano();
		//ciu.setNombre("Jimmy");
		//ciu.setApellidO("Ortega");
		
		//EMPLEAADO
		//Empleado empl = new Empleado();
		//empl.setFechaIngreso(LocalDateTime.now());
		//empl.setSalario( new BigDecimal(20) );
		
		//ciu.setEmpleado(empl);
		
		//Ingresar
		//this.ciudadanoService.crear(ciu);
		//this.empleadoService.agregar(empl);
		
		//Segundo ejemplo:
		// Ciudadano ciu2 = new Ciudadano();
		// ciu2.setNombre("Juan");
		// ciu2.setApellidO("Perez");
		 
		 
		 
		// Empleado empl2= new Empleado();
		// BigDecimal claseSalario2 = new BigDecimal(20);
		// empl2.setSalario(new BigDecimal(30));
		// empl2.setFechaIngreso(LocalDateTime.now());
		 //empl2.setCiudadano(ciu2);
		 
		 //ciu2.setEmpleado(empl2);
		 
		// this.empleadoService.agregar(empl2);
		// this.ciudadanoService.crear(ciu2);
		
		
		//Agregar*************
		Hotel hote = new Hotel();
		hote.setNombre("Oro verde");
		hote.setDireccion("Francisco de Orrellana y Cueva");
		
		
		//Agregar habitacion****
		Habitacion habi = new Habitacion();
		Habitacion habi2 = new Habitacion();
		//List<Habitacion>habitaciones = new ArrayList<>();
		habi.setNumero("12A");
		habi2.setNumero("15B");
		//habi.setId(20);
		//habi.setHotel(this.hotelService.buscar(1));
		//this.habitacionService.crear(habi);
		//habitaciones.add(habi);
		this.hotelService.crear(hote);
		
		//Buscar Habitacion
		Hotel hote3 = this.hotelService.buscar(20);
		for (Habitacion habi3 : hote3.getHabitaciones()) {
		System.out.println(habi3);
		}
		
		
		//Eliminar habitacion
		
		//habi3.setId(1);
		//this.habitacionService.eliminar(1);

		//Hotel hote3 = new Hotel();
		//hote3.setNombre("Oro verde");
		//hote3.setDireccion("Francisco de Orrellana y Cueva");
		//this.hotelService.crear(hote3);
		
		
		//Actualizar
		//hote.setNombre("Mar y Sol");
		//hote.setDireccion("Ambato y Aguirre");
		//this.hotelService.modificar(hote);
		
		//Buscar
		//Hotel hote2 = this.hotelService.buscar(1);
		//System.out.println(hote2);
		
		//Eliminar
		
		//hote.setId(3);
		//this.hotelService.eliminar(3);
		
		
		
	
	}

}
