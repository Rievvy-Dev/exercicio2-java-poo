package br.edu.ufape.poo.exercicio2;

public abstract class Funcionario extends Pessoa{
	private float salario;
	
	public void reajustarSalario(float quant) {
		//Salario vai ser reajustado por valor;
		salario += quant;
	}
}
