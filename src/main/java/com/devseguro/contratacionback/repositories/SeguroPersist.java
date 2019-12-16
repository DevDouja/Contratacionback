package com.devseguro.contratacionback.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devseguro.contratacionback.model.Vivienda;

@Repository
public interface SeguroPersist extends JpaRepository<Vivienda, Long> {
	
}
