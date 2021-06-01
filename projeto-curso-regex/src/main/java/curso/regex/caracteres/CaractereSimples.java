package curso.regex.caracteres;

import java.util.regex.Pattern;

import curso.regex.util.PrintUtil;

public class CaractereSimples {

	public static void main(String[] args) {
		String texto = "1,2,3,4,5,6,a.b c!d?e";

		PrintUtil.splitAndPrintResult(texto, ",");

		PrintUtil.printResult(texto, ",");
		PrintUtil.printResult(texto, "A");

		PrintUtil.printResult(texto, "A", Pattern.CASE_INSENSITIVE);

		PrintUtil.printResult(texto, "2");

		PrintUtil.printResult(texto, "b c!d");
	}

}