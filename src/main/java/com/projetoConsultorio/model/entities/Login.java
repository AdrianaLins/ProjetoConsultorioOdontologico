package com.projetoConsultorio.model.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class Login {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int codigo;
	
	@OneToOne(targetEntity = Usuarios.class)
	@JoinColumn(name = "usuario_id")
	private Usuarios usuario_id;

	public Login() {
		
	}

	public Login(int codigo, Usuarios usuario_id) {
		this.codigo = codigo;
		this.usuario_id = usuario_id;
	}


	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Usuarios getUsuario_id() {
		return usuario_id;
	}

	public void setUsuario_id(Usuarios usuario_id) {
		this.usuario_id = usuario_id;
	}

}
