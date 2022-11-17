package com.example.C4_T26.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ventas")
public class Venta {

	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "cajero")
	private Cajero cajero;
	
	@ManyToOne
	@JoinColumn(name = "maquina")
	private MaquinaRegistradora maquinaRegistradora;
	
	@ManyToOne
	@JoinColumn(name = "producto")
	private Producto producto;
	
	
	//------------------CONSTRUCTORES----------------------------

	public Venta() {
		
	}

	public Venta(int id, Cajero cajero, MaquinaRegistradora maquinaRegistradora, Producto producto) {
		super();
		this.id = id;
		this.cajero = cajero;
		this.maquinaRegistradora = maquinaRegistradora;
		this.producto = producto;
	}
	
	//----------------GETTERS Y SETTERS------------------------------

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cajero getCajero() {
		return cajero;
	}

	public void setCajero(Cajero cajero) {
		this.cajero = cajero;
	}

	public MaquinaRegistradora getMaquinaRegistradora() {
		return maquinaRegistradora;
	}

	public void setMaquinaRegistradora(MaquinaRegistradora maquinaRegistradora) {
		this.maquinaRegistradora = maquinaRegistradora;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	//------------------------TOSTRING-----------------------------

	@Override
	public String toString() {
		return "Venta [id=" + id + ", cajero=" + cajero + ", maquinaRegistradora=" + maquinaRegistradora + ", producto="
				+ producto + "]";
	}
	
}
