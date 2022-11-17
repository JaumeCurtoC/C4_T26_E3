package com.example.C4_T26.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.C4_T26.dao.ICajeroDAO;
import com.example.C4_T26.dto.Cajero;

@Service
public class CajeroServiceImpl implements ICajeroService {

	@Autowired
	ICajeroDAO cajeroDAO;

	@Override
	public List<Cajero> listarCajeros() {
		// TODO Auto-generated method stub
		return cajeroDAO.findAll();
	}

	@Override
	public Cajero guardarCajero(Cajero cajero) {
		// TODO Auto-generated method stub
		return cajeroDAO.save(cajero);
	}

	@Override
	public Cajero cajeroXID(int id) {
		// TODO Auto-generated method stub
		return cajeroDAO.findById(id).get();
	}

	@Override
	public Cajero actualizarCajero(Cajero cajero) {
		// TODO Auto-generated method stub
		return cajeroDAO.save(cajero);
	}

	@Override
	public void eliminarCajero(int id) {
		// TODO Auto-generated method stub
		cajeroDAO.deleteById(id);
	}
}
