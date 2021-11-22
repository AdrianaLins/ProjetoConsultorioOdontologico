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

import com.projetoConsultorio.model.entities.FichaClinica;
import com.projetoConsultorio.repositories.FichaClinicaRepository;

@RestController
@RequestMapping("/api/FichaClinicaConsultorioOdontologico")
public class FichaClinicaController {

	@Autowired
	private FichaClinicaRepository fichaClinicaRepository;

	// Inserindo ou Atualizando Ficha Clínica
	@RequestMapping(method = { RequestMethod.POST, RequestMethod.PUT})
	public @ResponseBody FichaClinica criandoFichaClinica(@Valid FichaClinica FichaClinica) {
		fichaClinicaRepository.save(FichaClinica);
		return FichaClinica;

	}

	// Listando Ficha Clínica
	@GetMapping("/fichaClinica/lista")
	public List<FichaClinica> listaFichaClínica() {
		return fichaClinicaRepository.findAll();
	}


	// Pesquisar Ficha Clínica por ID
	@GetMapping("/fichaClinica/buscaFichaClinica/{id}")
	public Optional<FichaClinica> buscaFichaClinicaPorId(@PathVariable("id") int id) {
		return fichaClinicaRepository.findById(id);

	}

	// Excluindo Ficha Clínica por ID
	@DeleteMapping("/fichaClinica/excluir/{id}")
	public void excluiFichaClinicaPorId(@PathVariable("id") int id) {
		fichaClinicaRepository.deleteById(id);

	}

}
