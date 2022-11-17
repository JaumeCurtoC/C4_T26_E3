package com.example.C4_T26.service;

import java.util.List;

import com.example.C4_T26.dto.Producto;

public interface IProductoService {

	// Metodos CRUD
	//Listar
	public List<Producto> listarProductos();
	
	// CREATE
	public Producto guardarProducto(Producto producto);
	
	// READ
	public Producto productoXID(int id);
	
	// UPDATE
	public Producto actualizarProducto(Producto producto);
	
	// DELETE
	public void eliminarProducto(int id);
	
}
