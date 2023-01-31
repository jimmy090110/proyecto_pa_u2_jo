package com.example.demo.manytomany.repo;

import com.example.demo.manytomany.modelo.Cliente;

public interface IClienteRepo {
	
	public void insertar(Cliente cliente);
	public void actualizar(Cliente cliente);
	public Cliente buscar(Integer id);
	public void borrar(Integer id);

}
