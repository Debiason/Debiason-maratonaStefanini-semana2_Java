package br.com.maratona.dev;

import java.math.BigDecimal;
import java.util.Date;


public class Pessoa {
	
	private char    sexo;
	
	private Integer    idade;
	private Long       cpf;
	private Boolean    vivo;
	private String     nome;
	private Date       nascimento;
	
	private BigDecimal saldo;
	
	
	//Construtor;
	
	public Pessoa() {
		
		
		
	}

// metodos de acesso
	public char getSexo() {
		return sexo;
	}


	public void setSexo(char sexo) {
		this.sexo = sexo;
	}


	public Integer getIdade() {
		return idade;
	}


	public void setIdade(Integer idade) {
		if(idade > 100) {
			System.out.println("Idade maior que 100");	
		}
		this.idade = idade;
	}


	public Long getCpf() {
		return cpf;
	}


	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}


	public Boolean getVivo() {
		return vivo;
	}


	public void setVivo(Boolean vivo) {
		this.vivo = vivo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Date getNascimento() {
		return nascimento;
	}


	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}


	public BigDecimal getSaldo() {
		return saldo;
	}


	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

}
