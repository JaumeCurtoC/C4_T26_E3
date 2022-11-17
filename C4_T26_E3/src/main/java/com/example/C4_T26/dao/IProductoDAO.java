package com.example.C4_T26.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.C4_T26.dto.Producto;

public interface IProductoDAO extends JpaRepository<Producto, Integer> {

}
