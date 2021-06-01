package curso.regex.conjuntos;

import curso.regex.util.PrintUtil;

public class IntervalosCuidados {

	public static void main(String[] args) {
		String texto = "ABC [abc] a-c 1234";

		PrintUtil.printResult(texto, "[a-c]");
		PrintUtil.printResult(texto, "a-c"); // não define um range
		PrintUtil.printResult(texto, "[A-z]");  // intervalos usam a ordem da tabela UNICODE

		// tem que respeitar a ordem da tabela UNICODE
		// PrintUtil.printResult(texto, "[a-Z]");
		// PrintUtil.printResult(texto, "[4-1]");
	}

}