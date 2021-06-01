package curso.regex.caracteres;

import curso.regex.util.PrintUtil;

public class ProblemaPonto {

	public static void main(String[] args) {
		String texto = "Bom\ndia";

		PrintUtil.printResult(texto, "...");
		PrintUtil.printResult(texto, "...."); // o ponto não engloba o \n

		// dotall - algums linguagens tem um flag /exp/s, mas JS não!
	}

}