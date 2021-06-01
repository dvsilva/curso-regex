package curso.regex.conjuntos;

import curso.regex.util.PrintUtil;

public class ConjuntosComMetacaracteres {

	public static void main(String[] args) {
		String texto = ".$+*?-";

		PrintUtil.printResult(texto, "[+.?*$]."); // não precisa de escape dentro do conjunto
		PrintUtil.printResult(texto, "[$-?]"); // isso é um intervalo (range)

		// NÃO é um intervalo (range)...
		PrintUtil.printResult(texto, "[$\\-?]");
		PrintUtil.printResult(texto, "[-?]");
		// pode precisar de escape dentro do conjunto: - [ ] ^
	}

}