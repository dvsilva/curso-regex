package curso.regex.receitas;

import curso.regex.util.PrintUtil;

public class IntervaloNumerico {

	public static void main(String[] args) {
		String texto = "0 1 10 192 199 201 249 255 256 312 1010 1512";

		// números entre 0-255
		PrintUtil.printResult(texto, "\\b(\\d{1,2}|1\\d{2}|2[0-4]\\d|25[0-5])\\b");
	}

}