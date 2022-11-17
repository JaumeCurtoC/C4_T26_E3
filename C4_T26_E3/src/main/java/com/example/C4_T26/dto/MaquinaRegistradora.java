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
@Table(name = "maquinas_registradoras")
public class MaquinaRegistradora {

	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;

	@Column(name = "piso")
	private int piso;

	@OneToMany
	@JoinColumn(name = "codigo")
	private List<Venta> ventas;

	//------------------CONSTRUCTORES----------------------------
	
	public MaquinaRegistradora() {

	}

	public MaquinaRegistradora(int codigo, int piso, List<Venta> ventas) {
		this.codigo = codigo;
		this.piso = piso;
		this.ventas = ventas;
	}
	
	//----------------GETTERS Y SETTERS------------------------------

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
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
		return "MaquinaRegistradora [codigo=" + codigo + ", piso=" + piso + "]";
	}

}
