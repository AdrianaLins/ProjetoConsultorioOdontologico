package com.projetoConsultorio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoConsultorio.model.entities.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {

}
