package br.edu.ufape.poo.exercicio2;

import java.util.Date;

public class Seguranca extends Funcionario{
	private boolean noturno;
	
	public Seguranca(String nome, Date nascimento, String cpf, Endereco endereco, boolean noturno) {
		super(nome, nascimento, cpf, endereco);
		this.noturno = noturno;
	}
}
