package curso.regex.grupos;

import java.util.regex.Pattern;

import curso.regex.util.PrintUtil;

public class GruposAlgunsCuidados {

	public static void main(String[] args) {
		String texto = "Pedrinho (filho do Pedro Silva) é doutor do ABCabc!";
		PrintUtil.printResult(texto, "[(abc)]", Pattern.CASE_INSENSITIVE); // não é um grupo
		PrintUtil.printResult(texto, "([abc])", Pattern.CASE_INSENSITIVE); 
		PrintUtil.printResult(texto, "(abc)+", Pattern.CASE_INSENSITIVE); 
	}

}