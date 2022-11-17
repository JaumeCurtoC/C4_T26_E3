package com.example.C4_T26.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.C4_T26.dao.IProductoDAO;
import com.example.C4_T26.dto.Producto;


@Service
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	IProductoDAO productoDAO;

	@Override
	public List<Producto> listarProductos() {
		// TODO Auto-generated method stub
		return productoDAO.findAll();
	}

	@Override
	public Producto guardarProducto(Producto producto) {
		// TODO Auto-generated method stub
		return productoDAO.save(producto);
	}

	@Override
	public Producto productoXID(int id) {
		// TODO Auto-generated method stub
		return productoDAO.findById(id).get();
	}

	@Override
	public Producto actualizarProducto(Producto producto) {
		// TODO Auto-generated method stub
		return productoDAO.save(producto);
	}

	@Override
	public void eliminarProducto(int id) {
		// TODO Auto-generated method stub
		productoDAO.deleteById(id);
	}

	
}
