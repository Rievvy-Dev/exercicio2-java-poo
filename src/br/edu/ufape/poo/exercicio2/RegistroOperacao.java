package br.edu.ufape.poo.exercicio2;

import java.util.Date;

public class RegistroOperacao {
	private String operacao;
	private float valor;
	private Date data;
	
	public RegistroOperacao(String op, float v) {
		operacao = op;
		valor = v;
		data = new Date();
	}
	
	public String exibir() {
		return operacao + " R$ " + valor + "   " +  data;
	}
	
	public int consultarMes() {
		return data.getMonth() + 1;
	}
}
