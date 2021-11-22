package com.projetoConsultorio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoConsultorio.model.entities.Login;

public interface LoginRepository extends JpaRepository<Login, Integer> {
	

}
