package com.example.demo.manytomany.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.manytomany.modelo.Cliente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class ClienteRepoImpl implements IClienteRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cliente);
	}

	@Override
	public void actualizar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.entityManager.merge(cliente);
	}

	@Override
	public Cliente buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Cliente.class, id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		Cliente cli= this.buscar(id);
		this.entityManager.remove(cli);
	}

}
