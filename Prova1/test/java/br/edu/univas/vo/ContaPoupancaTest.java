package br.edu.univas.vo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Before;
import org.junit.Test;

public class ContaPoupancaTest {
	
	private ContaPoupanca conta;
	
	@Before
	public void setup() {
		conta = new ContaPoupanca(1, null, 2);		
	}
	
	@Test
	public void givenToWithDrawWhenHasNoBalanceShouldReturnFalse() {
		boolean success = conta.sacar(100);
		
		assertFalse(success);
	}
	
	@Test
	public void givenToWithDrawWhenHasBalanceShouldReturnTrue() {
		conta.depositar(200);
		
		boolean success = conta.sacar(100);
		
		assertTrue(success);
	}
	
	@Test
	public void givenDepositWhenBalanceIsZeroShouldUpdateBalance() {
		boolean success = conta.depositar(100);
		
		assertTrue(success);
		assertEquals(100, conta.getSaldo(), 0.0);
	}
	
	@Test
	public void givenTransferSomeAmountWhenHasNoBalanceShouldReturnFalse() {
		ContaCorrente contaDestino = new ContaCorrente(2, null, 0, 50);
		
		boolean success = conta.transferenciaEletronica(contaDestino, 100);
		
		assertFalse(success);
		assertEquals(0.0, contaDestino.getSaldo(), 0.0);
	}
	
	@Test
	public void givenTransferSomeAmountWhenHasBalanceShouldReturnTrue() {
		ContaCorrente contaDestino = new ContaCorrente(2, null, 0, 50);
		conta.depositar(250);
		
		boolean success = conta.transferenciaEletronica(contaDestino, 100);
		
		assertTrue(success);
		assertEquals(100.0, contaDestino.getSaldo(), 0.0);
		assertEquals(150.0, conta.getSaldo(), 0.0);
	}
	
	@Test
	public void givenUpdateBalanceShouldUpdateBalance() {
		conta.depositar(150);
		
		conta.atualizarSaldo();
		
		assertEquals(153, conta.getSaldo(), 0.0);
	}
}
