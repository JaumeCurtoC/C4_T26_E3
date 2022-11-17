package com.example.C4_T26.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.C4_T26.dto.Producto;
import com.example.C4_T26.service.ProductoServiceImpl;

@RestController
@RequestMapping("/api")
public class ProductoController {

	@Autowired
	ProductoServiceImpl productoServiceImpl;
	
	@GetMapping("/productos")
	public List<Producto> listarProductos(){
		return productoServiceImpl.listarProductos();
	}
	
	@PostMapping("/productos")
	public Producto salvarProducto(@RequestBody Producto producto) {
		return productoServiceImpl.guardarProducto(producto);
	}
	
	@GetMapping("/productos/{id}")
	public Producto ProductoXID(@PathVariable(name = "id") int id) {
		return productoServiceImpl.productoXID(id);
	}
	
	@PutMapping("productos/{id}")
	public Producto actualizarProducto(@PathVariable(name = "id") int id, @RequestBody Producto producto) {
		Producto pro_s = new Producto();
		Producto pro_a = new Producto();
		
		pro_s = productoServiceImpl.productoXID(id);
		
		pro_s.setNombre(producto.getNombre());
		pro_s.setPrecio(producto.getPrecio());
		
		pro_a = productoServiceImpl.actualizarProducto(pro_s);
		
		System.out.println("Producto actualizado:" + pro_a);
		
		return pro_a;
	}
	
	@DeleteMapping("/productos/{id}")
	public void eliminarProducto(@PathVariable(name = "id") int id) {
		productoServiceImpl.eliminarProducto(id);
	}
}
