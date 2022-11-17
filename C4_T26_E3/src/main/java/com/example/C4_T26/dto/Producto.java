package com.example.C4_T26.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "productos")
public class Producto {

	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;

	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "precio")
	private int precio;

	@OneToMany
	@JoinColumn(name = "codigo")
	private List<Venta> ventas;
	
	//------------------CONSTRUCTORES----------------------------

	public Producto() {

	}
	
	public Producto(int codigo, String nombre, int precio, List<Venta> ventas) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.ventas = ventas;
	}

	//----------------GETTERS Y SETTERS------------------------------

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Venta")
	public List<Venta> getVentas() {
		return ventas;
	}

	public void setVentas(List<Venta> ventas) {
		this.ventas = ventas;
	}

	//------------------------TOSTRING-----------------------------
	
	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	
}
