package curso.regex.grupos;

import java.util.regex.Pattern;

import curso.regex.util.PrintUtil;

public class GruposEspeciais1 {

	public static void main(String[] args) {
		String texto = "João é calmo, mas no transito fica nervoso.";
		
		// Positive lookahead
		PrintUtil.printResult(texto, "[\\wÀ-ú]+", Pattern.CASE_INSENSITIVE);
		PrintUtil.printResult(texto, "[\\wÀ-ú]+(?=,)", Pattern.CASE_INSENSITIVE);
		PrintUtil.printResult(texto, "[\\wÀ-ú]+(?=\\.)", Pattern.CASE_INSENSITIVE);
		PrintUtil.printResult(texto, "[\\wÀ-ú]+(?=, mas)", Pattern.CASE_INSENSITIVE);

		// Negative lookahead
		PrintUtil.printResult(texto, "[\\wÀ-ú]+\\b(?!,)", Pattern.CASE_INSENSITIVE);
		PrintUtil.printResult(texto, "[\\wÀ-ú]+[\\s|\\.](?!,)", Pattern.CASE_INSENSITIVE);
	}

}