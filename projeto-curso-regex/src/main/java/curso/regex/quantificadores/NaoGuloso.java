package curso.regex.quantificadores;

import curso.regex.util.PrintUtil;

public class NaoGuloso {

	public static void main(String[] args) {
		String texto = "<div>Conteudo 01</div><div>Conteudo 02</div>";

		// quantificadores SÃO gulosos (greedy)...
		PrintUtil.printResult(texto, "<div>.+<\\/div>");
		PrintUtil.printResult(texto, "<div>.*<\\/div>");
		PrintUtil.printResult(texto, "<div>.{0,100}<\\/div>");

		// quantificadores NÃO gulosos (lazy)...
		PrintUtil.printResult(texto, "<div>.+?<\\/div>");
		PrintUtil.printResult(texto, "<div>.*?<\\/div>");
		PrintUtil.printResult(texto, "<div>.{0,100}?<\\/div>");
	}

}