package br.edu.ufape.poo.exercicio2;

public class Main {
	public static void main(String[] args) {
		Conta conta = new ContaCorrente("sdamon", 20);
		
		System.out.print(conta.debitar(25));
	}
}
