package br.ce.marcos.tests;

import org.junit.Assert;
import org.junit.Test;

import br.ce.marcos.core.BaseTest;
import br.ce.marcos.pages.HomePage;

public class SaldoTest extends BaseTest {
	HomePage page = new HomePage();

	@Test
	public void testSaldoConta() {
		Assert.assertEquals("564.00", page.obterSaldoConta("Conta do Teste alterada"));
		
	}	
}
