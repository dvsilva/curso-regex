package curso.regex.quantificadores;

import java.util.regex.Pattern;

import curso.regex.util.PrintUtil;

public class ZeroMais {

	public static void main(String[] args) {
		String texto1 = "De longe eu avistei o fogo e uma pessoa gritando: FOGOOOOOO!";
		String texto2 = "There is a big fog in NYC";

		// * -> zero ou mais
		PrintUtil.printResult(texto1, "fogo*", Pattern.CASE_INSENSITIVE);
		PrintUtil.printResult(texto2, "fogo*", Pattern.CASE_INSENSITIVE);
	}

}