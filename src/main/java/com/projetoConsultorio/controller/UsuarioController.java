package com.projetoConsultorio.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.json.JsonbHttpMessageConverter;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.projetoConsultorio.model.entities.Login;
import com.projetoConsultorio.model.entities.Usuarios;
import com.projetoConsultorio.repositories.LoginRepository;
import com.projetoConsultorio.repositories.UsuarioRepository;


@RestController
@RequestMapping("/api/UsuarioConsultorioOdontologico")
public class UsuarioController {

	@Autowired
	private UsuarioRepository consultorioRepository;

	// Inserindo ou Atualizando usuário
	@RequestMapping(method = { RequestMethod.POST, RequestMethod.PUT })
	@ResponseStatus(HttpStatus.CREATED) //Quando é adicionado um novo dado via método post.
	public @ResponseBody Usuarios criandoUsuarios(@Valid Usuarios usuario) {
		consultorioRepository.save(usuario);
		return usuario;

	}

	// Listando usuários
	@GetMapping("/usuario/lista")
	public List<Usuarios> listaUsuarios() {
		return consultorioRepository.findAll();
	}

	// Pesquisar por usuário por ID
	@GetMapping("/usuario/buscaUsuario/{id}")
	public Optional<Usuarios> buscaUsuarioPorId(@PathVariable("id") int id) {
		return Optional.of(consultorioRepository.findById(id)
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuário não encontrado.")));

	}

	// Excluindo usuários por ID
	@DeleteMapping("/usuario/excluir/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT) //Ocorre quando é efetuado um delete e os dados são excluidos da database.
	public void excluiUsuarioPorId(@PathVariable("id") int id) {
		consultorioRepository.deleteById(id);
		

	}
}
