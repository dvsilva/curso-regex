package curso.regex.conjuntos;

import curso.regex.util.PrintUtil;

public class Conjuntos {

	public static void main(String[] args) {
		String texto = "1,2,3,4,5,6,a.b c!d?e[f";

		// para definir uma classe (ou conjunto) de caracteres usa []
		PrintUtil.printResult(texto, "[02468]");

		String texto2 = "João não vai passear na moto.";
		PrintUtil.printResult(texto2, "[aã]");
	}

}