package curso.regex.receitas;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import curso.regex.util.FileUtil;

public class ColorirCodigoFonte {

	public static void main(String[] args) throws IOException {
		String texto = FileUtil.read("codigoFonte.html");
		
		String codeRegex = "<code>[\\s\\S]*<\\/code>";
		
		String codigo = getFirstMatch(texto, codeRegex);
//		System.out.println(codigo);
						
		// String...
		codigo = aplicarCor(codigo, "(\".*\")", "ce9178");
		
		// palavras reservadas
		codigo = aplicarCor(codigo, "\b(package|public|class|static|if|else)\b", "d857cf");
		
		// tipos...
		codigo = aplicarCor(codigo, "\b(void|int)\b", "1385e2");
		
		// comentários de multiplas linhas...
		codigo = aplicarCor(codigo, "(\\*[\\s\\S]*\\*)", "267703");
		
		// comentários de uma linha...
		codigo = aplicarCor(codigo, "(\\.*?\n)", "267703");
//		System.out.println(codigo);
		
		String conteudoFinal = texto.replace(codeRegex, codigo);
		FileUtil.write("codigoFonte.html", conteudoFinal);
		
		System.out.println("Arquivo criado com sucesso!");
	}

	private static String getFirstMatch(String texto, String codeRegex) {
		Pattern regex = Pattern.compile(codeRegex);
		Matcher matcher = regex.matcher(texto);

		while (matcher.find()) {
			String group = matcher.group();
//			System.out.printf("Posicoes: %s, %s\tValor: %s%n", matcher.start(), matcher.end(), group);
			return group;
		}

		return null;
	}

	private static String aplicarCor(String txt, String reg, String cor) {
		String newString = new StringBuilder()
				.append(" <span style=\"color: #")
				.append(cor)
				.append("><b>$1</b></span>")
				.toString();
		
		return txt.replace(newString, reg);
	}

}