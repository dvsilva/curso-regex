package curso.regex.receitas;

import java.util.regex.Pattern;

import curso.regex.util.PrintUtil;

public class Senha {

	public static void main(String[] args) {
		String texto = """
				123456
				cod3r
				QUASE123!
				#OpA1
				#essaSenhaEGrande1234
				
				#OpA1?
				Foi123!
				""";

		// números entre 0-255
		PrintUtil.printResult(texto, "^.{6,20}$", Pattern.MULTILINE);
		PrintUtil.printResult(texto, "^(?=.*[A-Z]).{6,20}$", Pattern.MULTILINE);
		PrintUtil.printResult(texto, "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%!^&*]).{6,20}$", Pattern.MULTILINE);
	}

}