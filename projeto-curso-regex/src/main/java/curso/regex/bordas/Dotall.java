package curso.regex.bordas;

import java.util.regex.Pattern;

import curso.regex.util.PrintUtil;

public class Dotall {

	public static void main(String[] args) {
		String texto = "Romário era um excelente jogador\n, mas hoje é um político questionador";
		PrintUtil.printResult(texto, "^r.*r$", Pattern.CASE_INSENSITIVE); // problema do dotall
		PrintUtil.printResult(texto, "^r[\\s\\S]*r$", Pattern.CASE_INSENSITIVE);
	}

}