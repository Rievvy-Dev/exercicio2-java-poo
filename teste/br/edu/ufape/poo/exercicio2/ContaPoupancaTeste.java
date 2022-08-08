package br.edu.ufape.poo.exercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContaPoupancaTeste {
	private ContaPoupanca conta;

	@BeforeEach
	void setUp() throws Exception {
		conta = new ContaPoupanca("123", 100);
	}

	@Test
	void testDebitar() {
		assertTrue(conta.debitar(10));
		assertEquals(90, conta.consultarSaldo());
		assertFalse(conta.debitar(1999));
	}

}
