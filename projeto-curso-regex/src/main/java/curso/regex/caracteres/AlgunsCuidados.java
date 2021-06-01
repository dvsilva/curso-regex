package curso.regex.caracteres;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AlgunsCuidados {

    public static void main(String[] args) {
        String textoUmaLinha = "..."; // aspas simples ou duplas
        String textoMultiLinha = """
        		linha 1
        		linha 2
        		""";

        Pattern patternLetras = Pattern.compile("\\s");
        Matcher matcher = patternLetras.matcher("   ");

        while (matcher.find()) {
            System.out.printf("Posicoes: %s, %s\tValor: %s%n",
                matcher.start(), matcher.end(), matcher.group());
        }
    }
}