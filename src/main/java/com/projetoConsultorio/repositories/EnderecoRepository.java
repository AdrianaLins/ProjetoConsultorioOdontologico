package com.projetoConsultorio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoConsultorio.model.entities.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
	

}
