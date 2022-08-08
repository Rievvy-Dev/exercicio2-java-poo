package br.edu.ufape.poo.exercicio2;

public class Endereco {
	private String logradouro;
	private String numero;
	private String cep;
	private String bairro;
	private String municipio;
	private String uf;
	
	public Endereco(String logradouro, String numero, String cep, String bairro, String municipio, String uf) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.cep = cep;
		this.bairro = bairro;
		this.municipio = municipio;
		this.uf = uf;
	}
}
