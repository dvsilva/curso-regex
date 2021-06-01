package curso.regex.grupos;

import curso.regex.util.PrintUtil;

public class Grupos {

	public static void main(String[] args) {
		String texto1 = "O José Simão é muito engraçado... hehehehehehe";
		PrintUtil.printResult(texto1, "(he)+");

		String texto2 = "http://www.site.info www.escola.ninja.br google.com.ag";
		PrintUtil.printResult(texto2, "(http:\\/\\/)?(www\\.)?\\w+\\.\\w{2,}(\\.\\w{2})?");
	}

}