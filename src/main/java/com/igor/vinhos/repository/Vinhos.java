package com.igor.vinhos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igor.vinhos.model.Vinho;

public interface Vinhos extends JpaRepository<Vinho, Long>{
	
	public List<Vinho> findByNomeContainingIgnoreCase(String nome); // como um like %palavra% e ignora maiusculo e minusculo 

}
