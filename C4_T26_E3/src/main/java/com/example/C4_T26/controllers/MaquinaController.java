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

import com.example.C4_T26.dto.MaquinaRegistradora;
import com.example.C4_T26.service.MaquinaServiceImpl;

@RestController
@RequestMapping("/api")
public class MaquinaController {

	@Autowired
	MaquinaServiceImpl maquinaServiceImpl;
	
	@GetMapping("/maquinas")
	public List<MaquinaRegistradora> listarMaquinas(){
		return maquinaServiceImpl.listarMaquinas();
	}
	
	@PostMapping("/maquinas")
	public MaquinaRegistradora salvarMaquina(@RequestBody MaquinaRegistradora maquina) {
		return maquinaServiceImpl.guardarMaquina(maquina);
	}
	
	@GetMapping("/maquinas/{id}")
	public MaquinaRegistradora MaquinaXID(@PathVariable(name = "id") int id) {
		return maquinaServiceImpl.maquinaXID(id);
	}
	
	@PutMapping("maquinas/{id}")
	public MaquinaRegistradora actualizarMaquina(@PathVariable(name = "id") int id, @RequestBody MaquinaRegistradora maquina) {
		MaquinaRegistradora maq_s = new MaquinaRegistradora();
		MaquinaRegistradora maq_a = new MaquinaRegistradora();
		
		maq_s = maquinaServiceImpl.maquinaXID(id);
		
		maq_s.setPiso(maquina.getPiso());
		
		maq_a = maquinaServiceImpl.actualizarMaquina(maq_s);
		
		System.out.println("Maquina actualizada:" + maq_a);
		
		return maq_a;
	}
	
	@DeleteMapping("/maquinas/{id}")
	public void eliminarMaquina(@PathVariable(name = "id") int id) {
		maquinaServiceImpl.eliminarMaquina(id);
	}
}
