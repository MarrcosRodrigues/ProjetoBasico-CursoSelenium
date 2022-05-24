package br.ce.marcos.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

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

}
