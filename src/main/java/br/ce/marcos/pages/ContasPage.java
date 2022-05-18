package br.ce.marcos.pages;

import org.openqa.selenium.By;

import br.ce.marcos.core.BasePage;

public class ContasPage extends BasePage {
	
	public void setNome(String nome) {
		escrever("nome", nome);
	}
	
	public void salvar() {
		clicarBotao(By.xpath("//button[.='Salvar']"));
	}
	
	public String obterMensagemSucesso() {
		return obterTexto(By.xpath("//div[@class='alert alert-success']"));
	}
	
	public String obterMensagemErro() {
		return obterTexto(By.xpath("//div[@class='alert alert-danger']"));
	}

	public void clicarAlterarConta(String nomeConta) {
		
//		clicarBotaoTabela(By.xpath("//*[@id='tabelaContas']//*/td[*='" + nomeConta + "']/..//span[@class='glyphicon glyphicon-edit']" ));
		
		obterCelula("Conta", nomeConta, "A��es", "tabelaContas").findElement(By.xpath(".//span[@class='glyphicon glyphicon-edit']")).click();
		
	}


}
