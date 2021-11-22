package com.projetoConsultorio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoConsultorio.model.entities.Usuarios;

public interface UsuarioRepository extends JpaRepository<Usuarios, Integer> {

}
