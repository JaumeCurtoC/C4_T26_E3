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

import com.example.C4_T26.dto.Venta;
import com.example.C4_T26.service.VentaServiceImpl;

@RestController
@RequestMapping("/api")
public class VentaController {

	@Autowired
	VentaServiceImpl ventaServiceImpl;
	
	@GetMapping("/ventas")
	public List<Venta> listarVentas(){
		return ventaServiceImpl.listarVentas();
	}
	
	@PostMapping("/ventas")
	public Venta salvarVenta(@RequestBody Venta venta) {
		return ventaServiceImpl.guardarVenta(venta);
	}
	
	@GetMapping("/ventas/{id}")
	public Venta VentaXID(@PathVariable(name = "id") int id) {
		return ventaServiceImpl.ventaXID(id);
	}
	
	@PutMapping("ventas/{id}")
	public Venta actualizarVenta(@PathVariable(name = "id") int id, @RequestBody Venta venta) {
		Venta ven_s = new Venta();
		Venta ven_a = new Venta();
		
		ven_s = ventaServiceImpl.ventaXID(id);
		
		ven_s.setCajero(venta.getCajero());
		ven_s.setProducto(venta.getProducto());
		ven_s.setMaquinaRegistradora(venta.getMaquinaRegistradora());
		
		ven_a = ventaServiceImpl.actualizarVenta(ven_s);
		
		System.out.println("Venta actualizada:" + ven_a);
		
		return ven_a;
	}
	
	@DeleteMapping("/ventas/{id}")
	public void eliminarVenta(@PathVariable(name = "id") int id) {
		ventaServiceImpl.eliminarVenta(id);
	}
}
