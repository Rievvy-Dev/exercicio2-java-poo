package br.edu.ufape.poo.exercicio2;

public class ContaEspecial extends ContaCorrente{

	public ContaEspecial(String id, float saldo) {
		super(id, saldo);
	}
	
	public void rendimentoMensal(float taxa) {
		setSaldo(getSaldo() + getSaldo()*taxa);
	}
	
}
