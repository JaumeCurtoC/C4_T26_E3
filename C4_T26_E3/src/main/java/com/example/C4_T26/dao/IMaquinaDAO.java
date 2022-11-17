package com.example.C4_T26.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.C4_T26.dto.MaquinaRegistradora;

public interface IMaquinaDAO extends JpaRepository<MaquinaRegistradora, Integer> {

}
