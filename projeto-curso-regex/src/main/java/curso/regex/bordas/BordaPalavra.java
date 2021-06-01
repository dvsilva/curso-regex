package curso.regex.bordas;

import java.util.regex.Pattern;

import curso.regex.util.PrintUtil;

public class BordaPalavra {

	public static void main(String[] args) {
		String texto1 = "dia diatonico diafragma media wikipedia bom_dia melodia radial";
		PrintUtil.printResult(texto1, "\\bdia\\w+", Pattern.CASE_INSENSITIVE);
		PrintUtil.printResult(texto1, "\\w+dia\\b", Pattern.CASE_INSENSITIVE);
		PrintUtil.printResult(texto1, "\\w+dia\\w+", Pattern.CASE_INSENSITIVE);
		PrintUtil.printResult(texto1, "\\bdia\\b", Pattern.CASE_INSENSITIVE);

		// borda é não \w, que é [^A-Za-z0-9_]... temos problemas com acentos!
		String texto2 = "dia diatônico diafragma, média wikipédia bom-dia melodia radial";
		PrintUtil.printResult(texto2, "\\bdia\\b", Pattern.CASE_INSENSITIVE);
		PrintUtil.printResult(texto2, "(\\S*)?dia(\\S*)?", Pattern.CASE_INSENSITIVE); // a vírgula entra!
		PrintUtil.printResult(texto2, "([\\wÀ-ú-]*)?dia([\\wÀ-ú-]*)?", Pattern.CASE_INSENSITIVE);
	}

}