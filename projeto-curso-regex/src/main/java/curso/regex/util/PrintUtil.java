package curso.regex.util;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class PrintUtil {

    public static void printResult(String texto, String strRegex) {
		Pattern regex = Pattern.compile(strRegex);
        printResult(texto, regex);
    }
    
	public static void printResult(String texto, String strRegex, int flags) {
        Pattern regex = Pattern.compile(strRegex, flags);
        printResult(texto, regex);
	}

	public static void printResult(String texto, Pattern regex) {
		Matcher matcher = regex.matcher(texto);
        // System.out.println(matcher);

        boolean hasResult = false;
        
        while (matcher.find()) {
           if(!hasResult) {
        	   System.out.println("Match found !!!");
        	   // System.out.println(String.format("Informação do pattern '%s' encontrada em '%s'.", regex.pattern(), texto));
               hasResult = true;
           }

		   System.out.printf("Posicoes: %s, %s\tValor: %s%n", matcher.start(), matcher.end(), matcher.group());
		}
        
        if(!hasResult) {
            System.out.println(String.format("Informação do pattern '%s' não encontrada em '%s'.", regex.pattern(), texto));
        }
        
        /**
        // String[] matches = Pattern.compile("A")
        List<String> matches = Pattern.compile("A")
           .matcher(texto)
           .results()
           .map(MatchResult::group)
           //.toArray(String[]::new);
           .collect(Collectors.toList());

        matches.forEach(System.out::println);
       */
	}

	public static void splitAndPrintResult(String texto, String strRegex) {
		Pattern regex = Pattern.compile(strRegex);
        String[] array = regex.split(texto);
        
        Stream<String> stream = Arrays.stream(array);
		stream.forEach(item -> System.out.println("split result -> " + item));		
	}

}