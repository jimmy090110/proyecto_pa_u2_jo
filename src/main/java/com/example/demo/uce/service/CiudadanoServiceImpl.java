package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Ciudadano;
import com.example.demo.uce.repository.ICiudadadoRepo;

@Service
public class CiudadanoServiceImpl implements ICiudadanoService  {

	@Autowired
	private ICiudadadoRepo ciudadadoRepo;
	
	@Override
	public void crear(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
		this.ciudadadoRepo.actualizar(ciudadano);
		
	}

	@Override
	public void modificar(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
		this.ciudadadoRepo.actualizar(ciudadano);
		
	}

	@Override
	public Ciudadano buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.ciudadadoRepo.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.ciudadadoRepo.eliminar(id);
		
	}

}
