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
import com.projetoConsultorio.model.entities.Endereco;
import com.projetoConsultorio.repositories.EnderecoRepository;

@RestController
@RequestMapping("/api/EnderecoConsultorioOdontologico")
public class EnderecoController {

	@Autowired
	private EnderecoRepository enderecoRepository;

	// Inserindo ou Atualizando Endereço
	@RequestMapping(method = { RequestMethod.POST, RequestMethod.PUT})
	public @ResponseBody Endereco criandoEndereco(@Valid Endereco endereco) {
		enderecoRepository.save(endereco);
		return endereco;

	}

	// Listando Endereco
	@GetMapping("/endereco/lista")
	public List<Endereco> listaEndereco() {
		return enderecoRepository.findAll();
	}


	// Pesquisar por endereco por ID
	@GetMapping("/endereco/buscaEndereco/{id}")
	public Optional<Endereco> buscaEnderecoPorId(@PathVariable("id") int id) {
		return enderecoRepository.findById(id);

	}

	// Excluindo endereco por ID
	@DeleteMapping("/endereco/excluir/{id}")
	public void excluiEnderecoPorId(@PathVariable("id") int id) {
		enderecoRepository.deleteById(id);

	}

}
