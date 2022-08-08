package br.edu.ufape.poo.exercicio2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class ContaCorrenteTeste {
	private ContaCorrente conta;
	private ContaCorrente conta2;

	@BeforeEach
	void setUp() throws Exception {
		conta = new ContaCorrente("123", 200);
		conta2 = new ContaCorrente("321", 0);
	}
	
	@Test
	void testDebitar() {
		conta.acrescentarLimite(300);
		assertTrue(conta.debitar(20));
		assertEquals(180, conta.getSaldo());
		assertTrue(conta.debitar(280));
		assertEquals(-100, conta.getSaldo());
		assertFalse(conta.debitar(1000000));
		assertEquals(-100, conta.getSaldo());
	}

	@Test
	void testTransferir() {
		conta.acrescentarLimite(300);
		assertTrue(conta.transferir(20, conta2));
		assertEquals(20, conta2.getSaldo());
		assertEquals(180, conta.getSaldo());
		assertTrue(conta.transferir(200, conta2));
		assertEquals(-20, conta.getSaldo());
	}
	
	@Test
	void testExtratoMensal() {
		assertEquals(conta.extratoMensal(8).length, 0);
		conta2.creditar(100);
		conta.debitar(20);
		assertEquals(conta.extratoMensal(8).length, 1);
		//System.out.println(conta.extratoMensal(8).length);
	}
	
	@Test
	void testExtratoPeriodo() {
		@SuppressWarnings("deprecation")
		Date dataInicial = new Date(2021 - 1900, 8, 1);
		@SuppressWarnings("deprecation")
		Date dataFinal = new Date(2022 - 1900, 8, 3);
		
		conta.debitar(10);
		conta.debitar(10);
		conta.debitar(10);
		
		assertEquals(3, conta.extratoPeriodo(dataInicial, dataFinal).length);
		//System.out.println(conta.extratoPeriodo(dataInicial, dataFinal)[0].getData());
	}

}
