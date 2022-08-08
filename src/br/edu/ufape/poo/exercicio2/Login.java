package br.edu.ufape.poo.exercicio2;

public class Login {
	private String usuario;
	private String senha;
	
	public boolean autenticar(String senha) {
		if(this.senha.equals(senha)) {
			return true;
		} else {
			System.out.print("Senha incorreta!");
			return false;
		}
	}
}
