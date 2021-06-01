package curso.regex.grupos;

import java.util.regex.Pattern;

import curso.regex.util.PrintUtil;

public class Retrovisor {

	public static void main(String[] args) {
		String texto1 = "<b>Destaque</b><strong>Forte</strong><div>Conteudo</div>";
		PrintUtil.printResult(texto1, "<(\\w+)>.*<\\/\\1>");

		String texto2 = "Lentamente é mente muito lenta.";
		PrintUtil.printResult(texto2, "(lenta)(mente).*\\2.*\\1\\.", Pattern.CASE_INSENSITIVE);
		PrintUtil.printResult(texto2, "(?:lenta)(mente).*\\1", Pattern.CASE_INSENSITIVE); // ?: não guarda

		PrintUtil.printResult(texto2, "(lenta)(mente)", Pattern.CASE_INSENSITIVE);
		PrintUtil.printResult(texto2, "(lenta)(mente)?", Pattern.CASE_INSENSITIVE);

		System.out.println(texto2.replaceAll("(?i)(lenta)(mente)", "$2"));
		
		String texto3 = "abcdefghijkll";
		PrintUtil.printResult(texto3, "(a)(b)(c)(d)(e)(f)(g)(h)(i)(j)(k)(l)\\12");
	}

}