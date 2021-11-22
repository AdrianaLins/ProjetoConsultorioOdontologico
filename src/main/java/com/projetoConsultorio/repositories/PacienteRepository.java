package com.projetoConsultorio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoConsultorio.model.entities.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Integer> {

}
