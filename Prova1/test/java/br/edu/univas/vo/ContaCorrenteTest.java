package br.edu.univas.vo;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;

public class ContaCorrenteTest {

	@Test
	public void givenToWithDrawWhenHasNoBalanceShouldReturnFalse() {
		ContaCorrente conta = new ContaCorrente(1, null, 0, 50);
		
		boolean success = conta.sacar(100);
		
		assertFalse(success);
	}
	
	@Test
	public void givenToWithDrawWhenHasBalanceShouldReturnTrue() {
		ContaCorrente conta = new ContaCorrente(1, null, 0, 50);
		conta.depositar(200);
		
		boolean success = conta.sacar(100);
		
		assertTrue(success);
	}
	
}
