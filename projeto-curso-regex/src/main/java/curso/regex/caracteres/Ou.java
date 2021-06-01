package curso.regex.caracteres;

import curso.regex.util.PrintUtil;

public class Ou {

	public static void main(String[] args) {
		String texto = "Você precisa responder sim, não ou não sei!";
		PrintUtil.printResult(texto, "sim|não|sei"); // alternativa (OU)
	}

}