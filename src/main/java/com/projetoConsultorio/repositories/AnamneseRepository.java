package com.projetoConsultorio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoConsultorio.model.entities.Anamnese;

public interface AnamneseRepository extends JpaRepository<Anamnese, Integer> {

}
