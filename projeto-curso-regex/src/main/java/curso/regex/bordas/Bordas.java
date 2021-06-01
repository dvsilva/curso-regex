package curso.regex.bordas;

import java.util.regex.Pattern;

import curso.regex.util.PrintUtil;

public class Bordas {

	public static void main(String[] args) {
		String texto = "Romário era um excelente jogador\n, mas hoje é um político questionador";
		PrintUtil.printResult(texto, "r", Pattern.CASE_INSENSITIVE);
		PrintUtil.printResult(texto, "^r", Pattern.CASE_INSENSITIVE); // ^ inicio da linha/string
		PrintUtil.printResult(texto, "r$", Pattern.CASE_INSENSITIVE); // $ fim da linha/string
		PrintUtil.printResult(texto, "^r.*r$", Pattern.CASE_INSENSITIVE); // problema do dotall
	}

}