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
@Table(name = "cajeros")
public class Cajero {
	
	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	
	@Column(name = "nom_apels")
	private String nomApels;
	
	@OneToMany
	@JoinColumn(name = "codigo")
	private List<Venta> ventas;
	
	//------------------CONSTRUCTORES----------------------------

	public Cajero() {
		
	}

	public Cajero(int codigo, String nomApels, List<Venta> ventas) {
		this.codigo = codigo;
		this.nomApels = nomApels;
		this.ventas = ventas;
	}
	
	//----------------GETTERS Y SETTERS------------------------------
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int id) {
		this.codigo = id;
	}

	public String getNomApels() {
		return nomApels;
	}

	public void setNomApels(String nomApels) {
		this.nomApels = nomApels;
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
		return "Cajero [codigo=" + codigo + ", nomApels=" + nomApels + "]";
	}

}
