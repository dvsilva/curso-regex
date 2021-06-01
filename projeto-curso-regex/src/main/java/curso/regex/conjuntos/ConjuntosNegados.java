package curso.regex.conjuntos;

import curso.regex.util.PrintUtil;

public class ConjuntosNegados {

	public static void main(String[] args) {
		String texto = "1,2,3,a.b c!d?e[f";
		
		PrintUtil.printResult(texto, "\\D");
		PrintUtil.printResult(texto, "[^0-9]");
		PrintUtil.printResult(texto, "[^\\d!\\?\\[\\s,\\.]");
		
		String texto2 = "1: !\"#$%&\'()*+,-./ 2: :;<=>?@";
		PrintUtil.printResult(texto2, "[^!-/:-@\\s]");
	}

}