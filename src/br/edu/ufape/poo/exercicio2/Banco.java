package br.edu.ufape.poo.exercicio2;

public class Banco {
	private String nome;
	private Agencia[] agencias = new Agencia[20];
	private Cliente[] clientes = new Cliente[200];
	private int totalAgencias = 0;
	private int totalClientes = 0;
	
	public Banco(String n) {
		this.nome = n;
	}
	public void cadastrarAgência(Agencia agencia) {
		this.agencias[totalAgencias++] = agencia;
	}
	public Agencia procurarAgenciaPorNome(String nomeAgencia) {
		for(int i = 0; i < this.agencias.length; i++) {
			if(this.agencias[i].getNome().equals(nomeAgencia)) {
				return this.agencias[i];
			}
		}
		return null;
	}
	public void cadastrarCliente(Cliente cliente) {
		this.clientes[totalClientes++] = cliente;
	}
}
