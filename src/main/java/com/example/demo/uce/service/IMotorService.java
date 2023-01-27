package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Motor;

public interface IMotorService {
	public void agregar(Motor motor);
	public void modificar(Motor motor);
	public Motor buscar(Integer id);
	public void eliminar(Integer id);

}
