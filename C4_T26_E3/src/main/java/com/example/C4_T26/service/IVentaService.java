package com.example.C4_T26.service;

import java.util.List;

import com.example.C4_T26.dto.Venta;

public interface IVentaService {

	// Metodos CRUD
	//Listar
	public List<Venta> listarVentas();
	
	// CREATE
	public Venta guardarVenta(Venta venta);
	
	// READ
	public Venta ventaXID(int id);
	
	// UPDATE
	public Venta actualizarVenta(Venta venta);
	
	// DELETE
	public void eliminarVenta(int id);
	
}
