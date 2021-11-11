package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Person {

	private long id;
	
	private String nome;
	
	private int idade;
	
	private String sexo;
	
	private int telefone;
	
	private String endereco ;
	
	private String estado_civil;
	
	private int cep;
	
	private String local_nascimento;
	
	private String historico_paciente;
	
	//Getters e Setters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEstado_civil() {
		return estado_civil;
	}

	public void setEstado_civil(String estado_civil) {
		this.estado_civil = estado_civil;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getLocal_nascimento() {
		return local_nascimento;
	}

	public void setLocal_nascimento(String local_nascimento) {
		this.local_nascimento = local_nascimento;
	}

	public String getHistorico_paciente() {
		return historico_paciente;
	}

	public void setHistorico_paciente(String historico_paciente) {
		this.historico_paciente = historico_paciente;
	} 
	

	}

