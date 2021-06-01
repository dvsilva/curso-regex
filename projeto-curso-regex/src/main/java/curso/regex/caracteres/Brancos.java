package curso.regex.caracteres;

import java.util.regex.*;

public class Brancos {

	public static void main(String[] args) {
		String texto = "ca	r\nr	o s!";  

		Pattern patternLetras = Pattern.compile("ca\tr\nr\to\ss!");
		Matcher matcher = patternLetras.matcher(texto);

		while (matcher.find()) {
			System.out.printf("Posicoes: %s, %s\tValor: %s%n", matcher.start(), matcher.end(), matcher.group());
		}
	}
}