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
import com.projetoConsultorio.model.entities.Anamnese;
import com.projetoConsultorio.repositories.AnamneseRepository;

@RestController
@RequestMapping("/api/AnamneseConsultorioOdontologico")
public class AnamneseController {

	@Autowired
	private AnamneseRepository anamneseRepository;

	// Inserindo ou Atualizando
	@RequestMapping(method = { RequestMethod.POST, RequestMethod.PUT})
	public @ResponseBody Anamnese criandoAnamnese(@Valid Anamnese anamnese) {
		anamneseRepository.save(anamnese);
		return anamnese;

	}

	// Listando 
	@GetMapping("/anamnese/lista")
	public List<Anamnese> listaAnamnese() {
		return anamneseRepository.findAll();
	}


	// Pesquisar por ID
	@GetMapping("/anamnese/buscaAnamnese/{id}")
	public Optional<Anamnese> buscaAnamnesePorId(@PathVariable("id") int id) {
		return anamneseRepository.findById(id);

	}

	// Excluindo por ID
	@DeleteMapping("/anamnese/excluir/{id}")
	public void excluiAnamnesePorId(@PathVariable("id") int id) {
		anamneseRepository.deleteById(id);

	}

}
