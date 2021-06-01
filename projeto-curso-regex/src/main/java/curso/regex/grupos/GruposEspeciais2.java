package curso.regex.grupos;

import java.util.regex.Pattern;

import curso.regex.util.PrintUtil;

public class GruposEspeciais2 {

	public static void main(String[] args) {
		String texto = "supermercado superação hiperMERCADO Mercado";
		
		PrintUtil.printResult(texto, "(?:super)[\\wÀ-ú]++", Pattern.CASE_INSENSITIVE);
		
		// Positive Lookbehind
		PrintUtil.printResult(texto, "(?<=super)[\\wÀ-ú]+", Pattern.CASE_INSENSITIVE);
		
		// Negative Lookbehind	
		PrintUtil.printResult(texto, "(?<!super)mercado", Pattern.CASE_INSENSITIVE);
	}

}

