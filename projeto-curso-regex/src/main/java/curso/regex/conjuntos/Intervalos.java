package curso.regex.conjuntos;

import curso.regex.util.PrintUtil;

public class Intervalos {

	public static void main(String[] args) {
		String texto = "1,2,3,4,5,6,a.b c!d?e[f";

		PrintUtil.printResult(texto, "[a-z]");
		PrintUtil.printResult(texto, "[b-d]");
		PrintUtil.printResult(texto, "[2-4]");
		PrintUtil.printResult(texto, "[A-Z1-3]");
	}

}