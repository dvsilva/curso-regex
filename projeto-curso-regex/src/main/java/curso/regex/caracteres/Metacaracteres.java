package curso.regex.caracteres;

import curso.regex.util.PrintUtil;

public class Metacaracteres {

	public static void main(String[] args) {
		// . ? * + - ^ $ | [ ] { } ( ) \ :
		String texto = "1,2,3,4,5,6,a.b c!d?e";

		PrintUtil.printResult(texto, "\\.");
		PrintUtil.printResult(texto, ",|\\.|\\?|!| ");
	}

}