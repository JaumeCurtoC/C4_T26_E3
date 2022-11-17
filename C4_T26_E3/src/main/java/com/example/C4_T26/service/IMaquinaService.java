package com.example.C4_T26.service;

import java.util.List;

import com.example.C4_T26.dto.MaquinaRegistradora;

public interface IMaquinaService {

	// Metodos CRUD
	//Listar
	public List<MaquinaRegistradora> listarMaquinas();
	
	// CREATE
	public MaquinaRegistradora guardarMaquina(MaquinaRegistradora maquina);
	
	// READ
	public MaquinaRegistradora maquinaXID(int id);
	
	// UPDATE
	public MaquinaRegistradora actualizarMaquina(MaquinaRegistradora maquina);
	
	// DELETE
	public void eliminarMaquina(int id);
	
}
