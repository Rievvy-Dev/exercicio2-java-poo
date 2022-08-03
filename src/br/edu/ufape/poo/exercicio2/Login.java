package br.edu.ufape.poo.exercicio2;

public class Login {
	private String usuario;
	private String senha;
	private Gerente gerente;
	private Caixa caixa;
	private Cliente cliente;
	
	public boolean autenticar(String s) {
		if(s == senha) {
			return true;
		} else {
			System.out.print("Senha incorreta!");
			return false;
		}
	}
}
