package curso.regex.caracteres;

import curso.regex.util.PrintUtil;

public class Ponto {

	public static void main(String[] args) {
		String texto = "1,2,3,4,5,6,7,8,9,0";

		// . é um coringa, válido para uma posição
		PrintUtil.printResult(texto, "1.2");
		PrintUtil.printResult(texto, "1..2");
		PrintUtil.printResult(texto, "1..,");

		String notas = "8.3,7.1,8.8,10.0";
		PrintUtil.printResult(notas, "8..");
		PrintUtil.printResult(notas, ".\\..");
	}

}