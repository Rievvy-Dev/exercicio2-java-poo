package br.edu.ufape.poo.exercicio2;

import java.util.Date;

public abstract class Pessoa{
	private String nome;
	private Date nascimento;
	private String cpf;
	private Endereco endereco;
	
	public Pessoa(String nome, Date nascimento, String cpf, Endereco endereco) {
		this.nome = nome;
		this.nascimento = nascimento;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	
}
