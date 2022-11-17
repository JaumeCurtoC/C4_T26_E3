package com.example.C4_T26.service;

import java.util.List;

import com.example.C4_T26.dto.Cajero;

public interface ICajeroService {

	// Metodos CRUD
	//Listar
	public List<Cajero> listarCajeros();
	
	// CREATE
	public Cajero guardarCajero(Cajero cajero);
	
	// READ
	public Cajero cajeroXID(int id);
	
	// UPDATE
	public Cajero actualizarCajero(Cajero cajero);
	
	// DELETE
	public void eliminarCajero(int id);
	
}
