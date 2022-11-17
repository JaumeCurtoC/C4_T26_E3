package com.example.C4_T26.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.C4_T26.dao.IVentaDAO;
import com.example.C4_T26.dto.Venta;

@Service
public class VentaServiceImpl implements IVentaService{

	@Autowired
	IVentaDAO ventaDAO;

	@Override
	public List<Venta> listarVentas() {
		// TODO Auto-generated method stub
		return ventaDAO.findAll();
	}

	@Override
	public Venta guardarVenta(Venta venta) {
		// TODO Auto-generated method stub
		return ventaDAO.save(venta);
	}

	@Override
	public Venta ventaXID(int id) {
		// TODO Auto-generated method stub
		return ventaDAO.findById(id).get();
	}

	@Override
	public Venta actualizarVenta(Venta venta) {
		// TODO Auto-generated method stub
		return ventaDAO.save(venta);
	}

	@Override
	public void eliminarVenta(int id) {
		// TODO Auto-generated method stub
		ventaDAO.deleteById(id);
	}
}
