package curso.regex.quantificadores;

import curso.regex.util.PrintUtil;

public class DesafioTelefone {

	public static void main(String[] args) {
		String texto = """
				Lista telefônica:
				- (11) 98756-1212
				-98765-4321
				- (85) 99988-7766
				- (21)3261-8899
				""";

		PrintUtil.printResult(texto, "\\(?\\d{0,2}\\)?\\s?\\d{4,5}-\\d{4}");
	}

}