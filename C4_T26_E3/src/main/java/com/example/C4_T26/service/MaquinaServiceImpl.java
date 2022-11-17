package com.example.C4_T26.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.C4_T26.dao.IMaquinaDAO;
import com.example.C4_T26.dto.MaquinaRegistradora;

@Service
public class MaquinaServiceImpl implements IMaquinaService{

	@Autowired
	IMaquinaDAO maquinaDAO;

	@Override
	public List<MaquinaRegistradora> listarMaquinas() {
		// TODO Auto-generated method stub
		return maquinaDAO.findAll();
	}

	@Override
	public MaquinaRegistradora guardarMaquina(MaquinaRegistradora maquina) {
		// TODO Auto-generated method stub
		return maquinaDAO.save(maquina);
	}

	@Override
	public MaquinaRegistradora maquinaXID(int id) {
		// TODO Auto-generated method stub
		return maquinaDAO.findById(id).get();
	}

	@Override
	public MaquinaRegistradora actualizarMaquina(MaquinaRegistradora maquina) {
		// TODO Auto-generated method stub
		return maquinaDAO.save(maquina);
	}

	@Override
	public void eliminarMaquina(int id) {
		// TODO Auto-generated method stub
		maquinaDAO.deleteById(id);
	}
	
	
}
