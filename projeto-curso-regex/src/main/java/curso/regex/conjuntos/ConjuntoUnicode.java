package curso.regex.conjuntos;

import curso.regex.util.PrintUtil;

public class ConjuntoUnicode {

	public static void main(String[] args) {
		String texto = "áéíóú àèìòù âêîôû ç ãõ ü";
		PrintUtil.printResult(texto, "[À-ü]");
	}

}