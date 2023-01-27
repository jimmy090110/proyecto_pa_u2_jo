package com.example.demo.uce.service;


import com.example.demo.uce.modelo.Colegio;

public interface IColegioService {
	public void agregar(Colegio colegio);
	public void modificar(Colegio colegio);
	public Colegio buscar(Integer id);
	public void eliminar(Integer id);

}
