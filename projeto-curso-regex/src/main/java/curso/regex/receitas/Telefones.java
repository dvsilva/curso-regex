package curso.regex.receitas;

import curso.regex.util.PrintUtil;

public class Telefones {

	public static void main(String[] args) {
		String texto = """
				Lista telefônica:
				    - (21) 12345-6789
				    - (11) 62300-2234
				    - 5678-7771
				    - (85)3333-7890
				    - (1) 4321-1234
				    """;

		PrintUtil.printResult(texto, "(\\(\\d{2}\\)\\s?)?\\d{4,5}-\\d{4}");
	}

}