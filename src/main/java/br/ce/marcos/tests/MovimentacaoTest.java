package br.ce.marcos.tests;

import static br.ce.marcos.utils.DataUtils.obterDataFormatada;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.ce.marcos.core.BaseTest;
import br.ce.marcos.pages.MenuPage;
import br.ce.marcos.pages.MovimentacaoPage;
import br.ce.marcos.utils.DataUtils;

public class MovimentacaoTest extends BaseTest {

	private MenuPage menuPage = new MenuPage();
	private MovimentacaoPage movPage = new MovimentacaoPage();
	
	@Test
	public void test1InserirMovimentacao() {
		menuPage.acessarTelaInserirMovimentacao();
		
		movPage.setDataMovimentacao(obterDataFormatada(new Date()));
		movPage.setDataPagamento(obterDataFormatada(new Date()));
		movPage.setDescricao("Movimenta??o do Teste");
		movPage.setInteressado("Interessado Qualquer");
		movPage.setValor("500");
		movPage.setConta("Conta para movimentacoes");
		movPage.setStatusPago();
		movPage.salvar();
		
		Assert.assertEquals("Movimenta??o adicionada com sucesso!", movPage.obterMensagemSucesso());
		
		
	}
	
	@Test
	public void test2CamposObrigatorios() {
		menuPage.acessarTelaInserirMovimentacao();
		
		movPage.salvar();
		List<String> erros = movPage.obterErros();
//		Assert.assertEquals("Data da Movimenta??o ? obrigat?rio", erros.get(0));
//		Assert.assertTrue(erros.contains("Data da Movimenta??o ? obrigat?rio"));
		Assert.assertTrue(erros.containsAll(Arrays.asList(
				"Data da Movimenta??o ? obrigat?rio",
				"Data do pagamento ? obrigat?rio",
				"Descri??o ? obrigat?rio",
				"Interessado ? obrigat?rio",
				"Valor ? obrigat?rio",
				"Valor deve ser um n?mero"
				)));
		Assert.assertEquals(6, erros.size());
	}
	
	@Test
	public void test3InserirMovimentacaoFutura() {
		menuPage.acessarTelaInserirMovimentacao();
		
		Date dataFutura = DataUtils.obterDataComDiferencaDias(5);
		
		movPage.setDataMovimentacao(obterDataFormatada(dataFutura));
		movPage.setDataPagamento(obterDataFormatada(dataFutura));
		movPage.setDescricao("Movimenta??o do Teste");
		movPage.setInteressado("Interessado Qualquer");
		movPage.setValor("500");
		movPage.setConta("Conta para movimentacoes");
		movPage.setStatusPago();
		movPage.salvar();
		
		List<String> erros = movPage.obterErros();
		Assert.assertTrue(erros.contains("Data da Movimenta??o deve ser menor ou igual ? data atual"));
		Assert.assertEquals(1, erros.size());
		
	}
	
}
