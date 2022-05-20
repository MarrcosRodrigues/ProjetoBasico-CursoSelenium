package br.ce.marcos.tests;

import org.junit.Assert;
import org.junit.Test;

import br.ce.marcos.core.BaseTest;
import br.ce.marcos.pages.MenuPage;
import br.ce.marcos.pages.ResumoPage;

public class ResumoTest extends BaseTest {
	
	private MenuPage menuPage = new MenuPage();
	private ResumoPage resumoPage = new ResumoPage();
	
	@Test
	public void testExcluirMovimentacao() {
		menuPage.acessarTelaResumo();
		
		resumoPage.excluirMovimentacao();
		
		Assert.assertEquals("Movimentação removida com sucesso!", resumoPage.obterMensagemSucesso());
		
		
	}

}
