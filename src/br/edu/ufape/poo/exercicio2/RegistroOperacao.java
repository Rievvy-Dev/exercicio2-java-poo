package br.edu.ufape.poo.exercicio2;

import java.util.Date;

public class RegistroOperacao {
	private String operacao;
	private float valor;
	private Date data;
	
	public RegistroOperacao(String operacao, float valor) {
		this.operacao = operacao;
		this.valor = valor;
		this.data = new Date();
	}
	
	public String exibir() {
		return this.operacao + " R$ " + this.valor + "   " +  this.data;
	}
	
	public int consultarMes() {
		return this.data.getMonth() + 1;
	}
	
	public Date getData() {
		return this.data;
	}
}
