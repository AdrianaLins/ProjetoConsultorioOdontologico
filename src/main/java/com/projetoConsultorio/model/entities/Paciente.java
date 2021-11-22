package com.projetoConsultorio.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Paciente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int codigo;
	private String nome;
	private String email;
	private String cel;	
	private String data_nascimento;
	private String cpf;
	private String rg;
	@OneToOne(targetEntity = Endereco.class)
	@JoinColumn(name = "endereco_id")
	private Endereco endereco;
	@OneToOne(targetEntity = Anamnese.class)
	@JoinColumn(name = "anamnese_id")
	private Anamnese anamnese;
	
	public Paciente() {
		
	}

	

	public Paciente(int codigo, String nome, String email, String cel, String data_nascimento, String cpf, String rg,
			Endereco endereco, Anamnese anamnese) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.cel = cel;
		this.data_nascimento = data_nascimento;
		this.cpf = cpf;
		this.rg = rg;
		this.endereco = endereco;
		this.anamnese = anamnese;
	}



	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCel() {
		return cel;
	}

	public void setCel(String cel) {
		this.cel = cel;
	}

	public String getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(String data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Anamnese getAnamnese() {
		return anamnese;
	}

	public void setAnamnese(Anamnese anamnese) {
		this.anamnese = anamnese;
	}

	
	


}
