package br.edu.ufape.poo.exercicio2;

import java.util.Date;

public abstract class Funcionario extends Pessoa{
	private float salario;
	
	
	public Funcionario(String nome, Date nascimento, String cpf, Endereco endereço) {
		super(nome, nascimento, cpf, endereço);
	}


	public void reajustarSalario(float salario) {
		this.salario += salario;
	}
	
}
