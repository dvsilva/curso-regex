package curso.regex.bordas;

import java.util.regex.Pattern;

import curso.regex.util.PrintUtil;

public class Multiline {

	public static void main(String[] args) {
		String texto = """
				Leo é muito legal
				Emanuel foi jogar em Sergipe
				Bianca é casada com Habib
				""";
		
		PrintUtil.printResult(texto, "\\n", Pattern.CASE_INSENSITIVE);
		PrintUtil.printResult(texto, "^(\\w).+\\1$", Pattern.CASE_INSENSITIVE);
		PrintUtil.printResult(texto, "^(\\w).+\\1$", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
	}

}