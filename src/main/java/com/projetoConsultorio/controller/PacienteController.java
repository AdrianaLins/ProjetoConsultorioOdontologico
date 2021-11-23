package com.projetoConsultorio.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.projetoConsultorio.model.entities.Paciente;
import com.projetoConsultorio.repositories.PacienteRepository;

@RestController
@RequestMapping("/api/PacienteConsultorioOdontologico")
public class PacienteController {

	@Autowired
	private PacienteRepository pacienteRepository;

	// Inserindo ou Atualiza paciente
	@RequestMapping(method = { RequestMethod.POST, RequestMethod.PUT})
	public @ResponseBody Paciente criandoPaciente(@Valid Paciente paciente) {
		pacienteRepository.save(paciente);
		return paciente;

	}

	// Listando paciente
	@GetMapping("/paciente/lista")
	public List<Paciente> listaPaciente() {
		return pacienteRepository.findAll();
	}
	
	//Retornado paciente por nome
	@GetMapping(path = "/nome/{parteNome}")
	public Iterable<Paciente> obterProdutosPorNome(@PathVariable String parteNome) {
		return pacienteRepository.findByNomeContainingIgnoreCase(parteNome);
	}


	// Pesquisar por paciente por ID
	@GetMapping("/paciente/buscaPaciente/{id}")
	public Optional<Paciente> buscaPacientePorId(@PathVariable("id") int id) {
		return pacienteRepository.findById(id);

	}

	// Excluindo paciente por ID
	@DeleteMapping("/paciente/excluir/{id}")
	public void excluiPacientePorId(@PathVariable("id") int id) {
		pacienteRepository.deleteById(id);

	}

}
