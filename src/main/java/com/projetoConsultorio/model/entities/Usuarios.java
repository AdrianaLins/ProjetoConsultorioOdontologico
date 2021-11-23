package com.projetoConsultorio.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;





@Entity
public class Usuarios {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int codigoUsuario;
	private String nomeUsuario;
	private String senhaUsuario;
	private String tipoUsuario;
	

	public Usuarios() {

	}

	public Usuarios(int codigoUsuario, String nomeUsuario, String senhaUsuario, String tipoUsuario) {
		this.codigoUsuario = codigoUsuario;
		this.nomeUsuario = nomeUsuario;
		this.senhaUsuario = senhaUsuario;
		this.tipoUsuario = tipoUsuario;
	
	}

	public int getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(int codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getSenhaUsuario() {
		return senhaUsuario;
	}

	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}


	

}
