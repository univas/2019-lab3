package br.edu.univas.vo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class GerenteTest {

	@Test
	public void givenNewAccountShouldUpdateList() {
		Gerente gerente = new Gerente();
		
		Conta conta = new ContaCorrente(1, null, 0, 0);
		
		gerente.addConta(conta);
		
		assertEquals(1, gerente.getContas().size());
	}
	
}
