package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.manytomany.modelo.Cliente;
import com.example.demo.manytomany.modelo.Vehiculo;
import com.example.demo.manytomany.service.IClienteService;


@SpringBootApplication
public class DeberMapeoRelacionesDcApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DeberMapeoRelacionesDcApplication.class, args);
	}

	
	@Autowired
	private IClienteService clienteServices;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Set<Vehiculo> vehi = new HashSet<>();
		Set<Cliente>cli = new HashSet<>();

		Cliente cliente5 = new Cliente();
		cliente5.setNombre("Juan ");
		cliente5.setApellido("Alarzon");
		cliente5.setCedula("0102133551");
		cliente5.setNumTarjeta("11111");
		cli.add(cliente5);
		cliente5.setVehiculos(vehi);
	

		
		Vehiculo vehiculo2 = new Vehiculo();
		vehiculo2.setMarca("Ford");
		vehiculo2.setModelo("272");
		vehiculo2.setValor(new BigDecimal(20000));
		vehiculo2.setTipo("deportivo");
		vehi.add(vehiculo2);
		vehiculo2.setClientes(cli);
		
		Vehiculo vehiculo3 = new Vehiculo();
		vehiculo3.setMarca("Mazda");
		vehiculo3.setModelo("v8");
		vehiculo3.setValor(new BigDecimal(15000));
		vehiculo3.setTipo("deportivo");
		vehi.add(vehiculo3);
		vehiculo3.setClientes(cli);
		
		Vehiculo vehiculo4 = new Vehiculo();
		vehiculo4.setMarca("chevrolett");
		vehiculo4.setModelo("az");
		vehiculo4.setValor(new BigDecimal(50000));
		vehiculo4.setTipo("deportivo");
		vehi.add(vehiculo4);
		vehiculo4.setClientes(cli);

		
		
		this.clienteServices.agregar(cliente5);
		
	
		
		
		
	}

}
