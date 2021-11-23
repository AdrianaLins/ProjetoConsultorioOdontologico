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
import com.projetoConsultorio.model.entities.Funcionario;
import com.projetoConsultorio.model.entities.Paciente;
import com.projetoConsultorio.repositories.FuncionarioRepository;

@RestController
@RequestMapping("/api/FuncionarioConsultorioOdontologico")
public class FuncionarioController {

	@Autowired
	private FuncionarioRepository funcionarioRepositório;

	// Inserindo ou Atualiza Funcionario
	@RequestMapping(method = { RequestMethod.POST, RequestMethod.PUT })
	public @ResponseBody Funcionario insereFuncionario(@Valid Funcionario funcionario) {
		funcionarioRepositório.save(funcionario);
		return funcionario;

	}

	// Listando Funcionários
	@GetMapping("/funcionario/lista")
	public List<Funcionario> listaFuncionario() {
		return funcionarioRepositório.findAll();
	}

	// Retornado funcionário por nome
	@GetMapping(path = "/nomeFuncionario/{parteNome}")
	public Iterable<Funcionario> obterFuncionarioPorNome(@PathVariable String parteNome) {
		return funcionarioRepositório.findByNomeContainingIgnoreCase(parteNome);
	}

	// Pesquisar por funcionário por ID
	@GetMapping("/funcionario/buscaFuncionario/{id}")
	public Optional<Funcionario> buscaFuncionarioPorId(@PathVariable("id") int id) {
		return funcionarioRepositório.findById(id);

	}

	// Excluindo funcionário por ID
	@DeleteMapping("/funcionario/excluir/{id}")
	public void excluiFuncionarioPorId(@PathVariable("id") int id) {
		funcionarioRepositório.deleteById(id);

	}

}
