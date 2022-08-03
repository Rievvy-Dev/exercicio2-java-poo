package br.edu.ufape.poo.exercicio2;

import java.util.Arrays;

public abstract class Conta {
	private String id;
	private float saldo;
	private boolean ativo;
	private Cliente[] clientes = new Cliente[10];
	private RegistroOperacao[] registros = new RegistroOperacao[200];
	private Titularidade[] titularidades = new Titularidade[10];
	private int totalRegistros = 0;
	
	public Conta(String id, float saldo) {
		this.id = id;
		this.saldo = saldo;
		this.ativo = true;
	}
	
	public void creditar(float valor) {
		saldo += valor;
	}
	
	public boolean transferir(float valor, Conta c) {
		if(this.debitar(valor)) {
			c.creditar(valor);
			return true;
		} 
		return false;
	}
	
	public float consultarSaldo() {
		return this.saldo;
	}
	
	public void registrarMovimentacao(RegistroOperacao reg) {
		this.registros[totalRegistros++] = reg;
	}
	
	public RegistroOperacao[] extratoMensal(int mes) {
		RegistroOperacao[] retorno = Arrays.stream(this.registros)
				.filter(r -> r != null)
				.filter(r -> ((RegistroOperacao) r).consultarMes() == mes )
				.toArray(RegistroOperacao[]::new);

			return retorno; 
	}
	
	protected float getSaldo() {
		return this.saldo;
	}
	
	protected void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	protected String getId() {
		return this.id;
	}
	
	protected boolean getAtivo() {
		return this.ativo;
	}
	
	public abstract boolean debitar(float valor);
}
