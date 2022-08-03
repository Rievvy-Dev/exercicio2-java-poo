package br.edu.ufape.poo.exercicio2;

public class ContaPoupanca extends Conta{
	
	public ContaPoupanca(String id, float saldo) {
		super(id, saldo);
	}
	public boolean debitar(float valor) {
		if(this.getSaldo() > 0 && this.getSaldo() >= valor) {
			setSaldo(getSaldo()-valor);
			return true;
		} 
		return false;
	}
	public void rendimentoMensal(float taxa) {
		setSaldo(getSaldo() + getSaldo()*taxa);
	}
}
