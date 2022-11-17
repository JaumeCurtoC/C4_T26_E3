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

import com.example.C4_T26.dto.Cajero;
import com.example.C4_T26.service.CajeroServiceImpl;

@RestController
@RequestMapping("/api")
public class CajeroController {

	@Autowired
	CajeroServiceImpl cajeroServiceImpl;
	
	@GetMapping("/cajeros")
	public List<Cajero> listarCajeros(){
		return cajeroServiceImpl.listarCajeros();
	}
	
	@PostMapping("/cajeros")
	public Cajero salvarCajero(@RequestBody Cajero cajero) {
		return cajeroServiceImpl.guardarCajero(cajero);
	}
	
	@GetMapping("/cajeros/{id}")
	public Cajero CajeroXID(@PathVariable(name = "id") int id) {
		return cajeroServiceImpl.cajeroXID(id);
	}
	
	@PutMapping("cajeros/{id}")
	public Cajero actualizarCajero(@PathVariable(name = "id") int id, @RequestBody Cajero cajero) {
		Cajero caj_s = new Cajero();
		Cajero caj_a = new Cajero();
		
		caj_s = cajeroServiceImpl.cajeroXID(id);
		
		caj_s.setNomApels(cajero.getNomApels());
		
		caj_a = cajeroServiceImpl.actualizarCajero(caj_s);
		
		System.out.println("Cajero actualizado:" + caj_a);
		
		return caj_a;
	}
	
	@DeleteMapping("/cajeros/{id}")
	public void eliminarCajero(@PathVariable(name = "id") int id) {
		cajeroServiceImpl.eliminarCajero(id);
	}
}
