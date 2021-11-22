package com.projetoConsultorio.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class FichaClinica {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int codigo;
	@OneToOne(targetEntity = Paciente.class)
	@JoinColumn(name = "paciente_id")
	private Paciente paciente;
	private String nome_dentista;
	private String data_consulta;	
	private String plano_tratamento;
	private String data_tratamento;
	
	public FichaClinica() {
		
	}

	public FichaClinica(int codigo, Paciente paciente, String nome_dentista, String data_consulta,
			String plano_tratamento, String data_tratamento) {
		this.codigo = codigo;
		this.paciente = paciente;
		this.nome_dentista = nome_dentista;
		this.data_consulta = data_consulta;
		this.plano_tratamento = plano_tratamento;
		this.data_tratamento = data_tratamento;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public String getNome_dentista() {
		return nome_dentista;
	}

	public void setNome_dentista(String nome_dentista) {
		this.nome_dentista = nome_dentista;
	}

	public String getData_consulta() {
		return data_consulta;
	}

	public void setData_consulta(String data_consulta) {
		this.data_consulta = data_consulta;
	}

	public String getPlano_tratamento() {
		return plano_tratamento;
	}

	public void setPlano_tratamento(String plano_tratamento) {
		this.plano_tratamento = plano_tratamento;
	}

	public String getData_tratamento() {
		return data_tratamento;
	}

	public void setData_tratamento(String data_tratamento) {
		this.data_tratamento = data_tratamento;
	}
	
	
	
	

}
