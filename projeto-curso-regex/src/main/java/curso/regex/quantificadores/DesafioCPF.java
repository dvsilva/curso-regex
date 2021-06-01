package curso.regex.quantificadores;

import curso.regex.util.PrintUtil;

public class DesafioCPF {

	public static void main(String[] args) {
		String texto = """
				CPF dos aprovados:
				- 600.567.890-12
			    - 765.998.345-23
			    - 454.674.333-21
			    - 678.987.123-87
			    - 789.112.543-00
			    """;

		PrintUtil.printResult(texto, "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}");
	}

}