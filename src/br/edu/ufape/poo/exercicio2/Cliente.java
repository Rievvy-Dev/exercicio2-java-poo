package br.edu.ufape.poo.exercicio2;

import java.util.Date;

public class Cliente extends Pessoa{
	private Login login;
	
	public Cliente(String nome, Date nascimento, String cpf, Endereco endereco, Login login) {
		super(nome, nascimento, cpf, endereco);
		this.login = login;
	}
	
}
