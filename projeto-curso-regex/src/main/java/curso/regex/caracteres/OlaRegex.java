package curso.regex.caracteres;

import curso.regex.util.PrintUtil;

public class OlaRegex {

	public static void main(String[] args) {
		String texto = "Casa bonita é casa amarela da esquina com a Rua ACASALAR.";

		PrintUtil.printResult(texto, "casa");
		PrintUtil.printResult(texto, "a b");
	}

}