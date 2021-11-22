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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.projetoConsultorio.model.entities.Login;
import com.projetoConsultorio.model.entities.Usuarios;
import com.projetoConsultorio.repositories.LoginRepository;

@RestController
@RequestMapping("/api/LoginConsultorioOdontologico")
public class LoginController {

	@Autowired
	private LoginRepository loginRepository;

	// Inserindo ou Atualizando Login
	@RequestMapping(method = { RequestMethod.POST, RequestMethod.PUT })
	public @ResponseBody Login criandoLogin(@Valid Login login) {
		loginRepository.save(login);
		return login;

	}

	// Listando Login
	@GetMapping("/login/lista")
	public List<Login> listaLogin() {
		return loginRepository.findAll();
	}

	// Pesquisar por login por ID
	@GetMapping("/login/buscaUsuario/{id}")
	public Optional<Login> buscaLoginPorId(@PathVariable("id") int id) {
		return loginRepository.findById(id);

	}

	// Excluindo login por ID
	@DeleteMapping("/login/excluir/{id}")
	public void excluiLoginPorId(@PathVariable("id") int id) {
		loginRepository.deleteById(id);

	}

}
