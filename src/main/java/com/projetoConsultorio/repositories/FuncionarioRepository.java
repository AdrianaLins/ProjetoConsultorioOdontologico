package com.projetoConsultorio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoConsultorio.model.entities.Funcionario;
import com.projetoConsultorio.model.entities.Paciente;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {
	
	public Iterable<Funcionario> findByNomeContainingIgnoreCase(String parteNome);

}
