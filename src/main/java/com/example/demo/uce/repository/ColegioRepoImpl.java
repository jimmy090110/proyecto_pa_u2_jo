package com.example.demo.uce.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.uce.modelo.Colegio;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
@Transactional
public class ColegioRepoImpl implements IColegioRepo {

	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Colegio colegio) {
		// TODO Auto-generated method stub
		this.entityManager.persist(colegio);
		
	}

	@Override
	public void actualizar(Colegio colegio) {
		// TODO Auto-generated method stub
		this.entityManager.merge(colegio);
		
	}

	@Override
	public Colegio buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Colegio.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Colegio col = this.buscar(id);
		this.entityManager.remove(col);
		
	}

}
