package curso.regex.receitas;

import java.text.MessageFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ipv4 {

	public static void main(String[] args) {
		String texto = """
				Inválidos:
				192.268.0.1
				1.333.1.1
				192.168.0.256
				256.256.256.256
	
				Válidos:
				192.168.0.1
				127.0.0.1
				10.0.0.255
				10.11.12.0
				255.255.255.255
				0.0.0.0
				""";
		
		String n = "(\\d{1,2}|1\\d{2}|2[0-4]\\d|25[0-5])";
		String formattedRegex = MessageFormat.format("\\b{0}\\.{0}\\.{0}\\.{0}\\b", n);
		
		Pattern regex = Pattern.compile(formattedRegex);
		Matcher matcher = regex.matcher(texto);

		boolean hasResult = false;
   	   
		while (matcher.find()) {
			if (!hasResult) {
				System.out.println("Match found !!!");
				hasResult = true;
			}

			System.out.printf("Posicoes: %s, %s\tValor: %s%n", matcher.start(), matcher.end(), matcher.group());
		}
	}

}