package curso.regex.caracteres;

import curso.regex.util.PrintUtil;

public class Unicode {

	public static void main(String[] args) {
		// no início...
		// Um byte (8 bits) - 256 caracteres
		// Símbolos, Pontuação, A-Z, a-z, 0-9

		// Dois bytes (16 bits) - 65500+ caracteres
		// +Símbolos, +Pontuação, A-Z, a-z, 0-9

		// Unicode
		// Quantidade de Bytes Variável - Expansível
		// Suporta mais de 1 Milhão caracteres
		// Atualmente tem mais de 100.000 caracteres atribuidos

		// https://unicode-table.com/pt/
		
		String texto = "aʬc௵d";
		PrintUtil.printResult(texto, "\\u02AC|\\u0BF5");
	}

}