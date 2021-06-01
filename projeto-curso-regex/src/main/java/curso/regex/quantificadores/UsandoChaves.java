package curso.regex.quantificadores;

import curso.regex.util.PrintUtil;

public class UsandoChaves {

	public static void main(String[] args) {
		String texto = "O João recebeu 120 milhões apostando 6 9 21 23 45 46.";

		// para definir uma quantificador usa {}
		PrintUtil.printResult(texto, "\\d{1,2}");
		PrintUtil.printResult(texto, "[0-9]{2}");
		PrintUtil.printResult(texto, "\\d{1,}");

		PrintUtil.printResult(texto, "\\w{7}");
		PrintUtil.printResult(texto, "[\\wõã]{7,}");

		// no futuro...
		PrintUtil.printResult(texto, "\\b\\d{1,2}\\b");
		PrintUtil.printResult(texto, "\\b[\\wõ]{7}\\b");
	}

}