package com.example.demo.uce.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.Motor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;


@Transactional
@Repository
public class MotorRepoImpl implements IMotorRepo {

	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Motor motor) {
		// TODO Auto-generated method stub
		this.entityManager.persist(motor);	
		
	}

	@Override
	public void actualizar(Motor motor) {
		// TODO Auto-generated method stub
		this.entityManager.merge(motor);
	}

	@Override
	public Motor buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Motor.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Motor mot = this.buscar(id);
		this.entityManager.remove(mot);
		
	}

}
