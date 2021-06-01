package curso.regex.caracteres;

import curso.regex.util.PrintUtil;

public class DesafioTresEspacos {

	public static void main(String[] args) {
		String texto = "a   b";

		PrintUtil.printResult(texto, "a   b");
		PrintUtil.printResult(texto, "a\s\s\sb");
		
		// no futuro...
		PrintUtil.printResult(texto, "a\s+b");
		PrintUtil.printResult(texto, "a {3}b");
		PrintUtil.printResult(texto, "a\s{3}b");
	}

}