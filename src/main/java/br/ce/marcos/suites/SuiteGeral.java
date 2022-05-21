package br.ce.marcos.suites;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.ce.marcos.core.DriverFactory;
import br.ce.marcos.pages.LoginPage;
import br.ce.marcos.tests.ContaTest;
import br.ce.marcos.tests.MovimentacaoTest;
import br.ce.marcos.tests.RemoverMovimentacaoContaTest;
import br.ce.marcos.tests.ResumoTest;
import br.ce.marcos.tests.SaldoTest;

@RunWith(Suite.class)
@SuiteClasses({
	ContaTest.class,
	MovimentacaoTest.class,
	RemoverMovimentacaoContaTest.class,
	SaldoTest.class,
	ResumoTest.class
})
               
public class SuiteGeral {
	private static LoginPage page = new LoginPage();
	
	
	@BeforeClass
	public static void inicializa() {
		page.acessarTelaInicial();
		
		page.setEmail("teste@teste21.com");
		page.setSenha("teste");
		page.entrar();
	}
	
	@AfterClass
	public static void finaliza(){
		DriverFactory.killDriver();
	}

}
