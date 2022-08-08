package br.edu.ufape.poo.exercicio2;

import java.util.Date;

public class Gerente extends Funcionario{
	private Login login;

	public Gerente(String nome, Date nascimento, String cpf, Endereco endereco, Login login) {
		super(nome, nascimento, cpf, endereco);
		this.login = login;
	}

}
