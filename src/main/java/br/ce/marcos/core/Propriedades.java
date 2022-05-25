package br.ce.marcos.core;

public class Propriedades {
	
	public static boolean FECHAR_BROWSER = true;

	public static Browsers BROWSER = Browsers.CHROME;
	
	public static TipoExecucao TIPO_EXECUCAO = TipoExecucao.NUVEM;
	
	public enum Browsers {
		EDGE,
		FIREFOX,
		CHROME,
	}
	
	public enum TipoExecucao {
		LOCAL,
		GRID,
		NUVEM
	}
}
