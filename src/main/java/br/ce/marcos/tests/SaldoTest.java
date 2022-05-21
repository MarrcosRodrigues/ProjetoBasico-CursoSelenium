package br.ce.marcos.tests;

import org.junit.Assert;
import org.junit.Test;

import br.ce.marcos.core.BaseTest;
import br.ce.marcos.core.Propriedades;
import br.ce.marcos.pages.HomePage;
import br.ce.marcos.pages.MenuPage;

public class SaldoTest extends BaseTest {
	private HomePage page = new HomePage();
	private MenuPage menuPage = new MenuPage();
	
	@Test
	public void testSaldoConta() {
		menuPage.acessarTelaPrincipal();
		Assert.assertEquals("500.00", page.obterSaldoConta(Propriedades.NOME_CONTA_ALTERADA));
		
	}	
}
