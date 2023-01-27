package com.example.demo.uce.repository;


import com.example.demo.uce.modelo.Colegio;

public interface IColegioRepo {
	public void insertar(Colegio colegio);
	public void actualizar(Colegio colegio);
	public Colegio buscar(Integer id);
	public void eliminar(Integer id);

}
