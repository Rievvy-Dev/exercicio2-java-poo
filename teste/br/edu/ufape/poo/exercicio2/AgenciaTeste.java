package br.edu.ufape.poo.exercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AgenciaTeste {
	private Agencia agencia;
	private ContaPoupanca conta1;
	private ContaPoupanca conta2;
	private Seguranca seguranca;
	
	@BeforeEach
	void setUp() throws Exception {
		agencia = new Agencia("willbonito", "123", null);
		conta1 = new ContaPoupanca("111", 200);
		conta2 = new ContaPoupanca("222", 100);
		seguranca = new Seguranca("Carlos", null, "123", null, true);
	}

	@Test
	void testAdcionarConta() {
		agencia.adcionarConta(conta1);
		assertEquals(agencia.getContas()[0], conta1);
	}

	@Test
	void testProcurarConta() {
		agencia.adcionarConta(conta1);
		agencia.adcionarConta(conta2);
		assertEquals(agencia.procurarConta("111"), conta1);
	}

	@Test
	void testAdicionarFuncionario() {
		agencia.adicionarFuncionario(seguranca);
		assertEquals(agencia.getFuncionarios()[0], seguranca);
	}

}
