package curso.regex.quantificadores;

import curso.regex.util.PrintUtil;

public class DesafioEmail {

	public static void main(String[] args) {
		String texto = """
				Os e-mails dos convidados são:
				- fulano@cod3r.com.br
				- xico@gmail.com
				- joao@empresa.info.br
				- maria_silva@registro.br
				- rafa.sampaio@yahoo.com
				""";

		PrintUtil.printResult(texto, "[a-zA-Z0-9_]+@[a-zA-Z0-9_]+\\.[a-zA-Z0-9_]{2,4}");
		PrintUtil.printResult(texto, "\\w+@\\w+\\.\\w{2,4}");
		PrintUtil.printResult(texto, "[\\w.]+@\\w+\\.\\w{2,4}");
		PrintUtil.printResult(texto, "[\\w.]+@\\w+\\.\\w{2,4}\\.?\\w{0,2}");

		// no futuro...
		PrintUtil.printResult(texto, "[\\w.]+@\\w+\\.\\w{2,4}(\\.\\w{2})?");
	}

}