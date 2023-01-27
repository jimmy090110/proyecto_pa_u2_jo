package com.example.demo.uce.repository;


import com.example.demo.uce.modelo.Motor;

public interface IMotorRepo {
	public void insertar(Motor motor);
	public void actualizar(Motor motor);
	public Motor buscar(Integer id);
	public void eliminar(Integer id);

}
