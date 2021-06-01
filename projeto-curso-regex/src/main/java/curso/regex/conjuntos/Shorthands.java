package curso.regex.conjuntos;

import curso.regex.util.PrintUtil;

public class Shorthands {

	public static void main(String[] args) {
		String texto = "1,2,3,4,5,6,a.b c!d?e\\r	-\nf_g";

		PrintUtil.printResult(texto, "\\d"); // números [0-9]
		PrintUtil.printResult(texto, "\\D"); // não números [^0-9]

		PrintUtil.printResult(texto, "\\w"); // caracteres [a-zA-Z0-9_]
		PrintUtil.printResult(texto, "\\W"); // não caracteres [^a-zA-Z0-9_]

		PrintUtil.printResult(texto, "\\s"); // espaço [ \t\n\r\f]
		PrintUtil.printResult(texto, "\\S"); // não espaço [^ \t\n\r\f]
		// \b \B
	}

}