package br.com.maratona.dev.resource;

public class Pessoa {
	
	private String nome;
	private Integer matricula;

	public Pessoa(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public Pessoa() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	
	

}
