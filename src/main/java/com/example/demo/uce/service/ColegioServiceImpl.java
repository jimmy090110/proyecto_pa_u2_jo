package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Colegio;
import com.example.demo.uce.repository.IColegioRepo;

@Service
public class ColegioServiceImpl implements IColegioService {
	
	@Autowired
	private IColegioRepo colegioRepo;

	@Override
	public void agregar(Colegio colegio) {
		// TODO Auto-generated method stub
		this.colegioRepo.insertar(colegio);
		
	}

	@Override
	public void modificar(Colegio colegio) {
		// TODO Auto-generated method stub
		this.colegioRepo.actualizar(colegio);
		
	}

	@Override
	public Colegio buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.colegioRepo.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.colegioRepo.eliminar(id);
		
	}

}
