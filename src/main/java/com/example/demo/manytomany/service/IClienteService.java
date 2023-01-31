package com.example.demo.manytomany.service;

import com.example.demo.manytomany.modelo.Cliente;

public interface IClienteService {
	
	public void agregar(Cliente cliente);
	public void modificar(Cliente cliente);
	public Cliente encontrar(Integer id);
	public void eliminar(Integer id);

}
