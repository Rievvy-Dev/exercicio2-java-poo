package br.edu.ufape.poo.exercicio2;

import java.util.Date;

public class ServicosGerais extends Funcionario{
	private String funcao;

	public ServicosGerais(String nome, Date nascimento, String cpf, Endereco endereco, String funcao) {
		super(nome, nascimento, cpf, endereco);
		this.funcao = funcao;
	}
	
	
}
