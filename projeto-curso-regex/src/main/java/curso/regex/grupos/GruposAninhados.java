package curso.regex.grupos;

import curso.regex.util.PrintUtil;

public class GruposAninhados {

	public static void main(String[] args) {
		String texto = "supermercado hipermercado minimercado mercado";
		PrintUtil.printResult(texto, "(super|hiper|mini)?mercado");
		PrintUtil.printResult(texto, "((hi|su)per|mini)?mercado");
	}

}