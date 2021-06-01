package curso.regex.quantificadores;

import java.util.regex.Pattern;

import curso.regex.util.PrintUtil;

public class UmMais {

	public static void main(String[] args) {
		String texto1 = "De longe eu avistei o fogox e uma pessoa gritando: FOGOOOOOO!";
		String texto2 = "There is a big fog in NYC";

		// + -> um ou mais
		PrintUtil.printResult(texto1, "fogo+", Pattern.CASE_INSENSITIVE);
		PrintUtil.printResult(texto2, "fogo+", Pattern.CASE_INSENSITIVE);

		String texto3 = "Os números: 0123456789.";
		PrintUtil.printResult(texto3, "[0-9]");
		PrintUtil.printResult(texto3, "[0-9]+");
	}

}