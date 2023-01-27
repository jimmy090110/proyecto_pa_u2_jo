package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Motor;
import com.example.demo.uce.repository.IMotorRepo;

@Service
public class MotorServiceImpl implements IMotorService {

	@Autowired
	private IMotorRepo motorRepo;
	
	@Override
	public void agregar(Motor motor) {
		// TODO Auto-generated method stub
		this.motorRepo.insertar(motor);
		
	}

	@Override
	public void modificar(Motor motor) {
		// TODO Auto-generated method stub
		this.motorRepo.actualizar(motor);
		
	}

	@Override
	public Motor buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.motorRepo.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.motorRepo.eliminar(id);
		
	}

}
