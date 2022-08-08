package br.edu.ufape.poo.exercicio2;

public class Agencia {
	private String nome;
	private String id;
	private Conta[] contas = new Conta[250];
	private Funcionario[] funcionarios = new Funcionario[20];
	private Endereco endereco;
	private int totalContas = 0;
	private int totalFuncionarios = 0;
	
	public Agencia(String nome, String id, Endereco endereco) {
		this.nome = nome;
		this.id = id;
		this.endereco = endereco;
	}
	public void adcionarConta(Conta conta) {
		this.contas[totalContas++] = conta;
	}
	public Conta procurarConta(String idConta) {
		for(int i = 0; i < this.contas.length; i++) {
			if(this.contas[i].getId().equals(idConta)) {
				return this.contas[i];
			}
		}
		return null;
	}
	public void adicionarFuncionario(Funcionario funcionario) {
		this.funcionarios[totalFuncionarios++] = funcionario;
	}
	
	protected String getNome() {
		return this.nome;
	}
	
	protected Conta[] getContas() {
		return this.contas;
	}
	
	protected Funcionario[] getFuncionarios() {
		return this.funcionarios;
	}
}
