package curso.regex.receitas;

import curso.regex.util.PrintUtil;

public class Email {

	public static void main(String[] args) {
		String texto = """
				Os e-mails dos convidados são:
				    - fulano@cod3r.com.br
				    - xico@gmail.com
				    - joao@empresa.info.br
				    - maria_silva@registro.br
				    - rafa.sampaio@yahoo.com
				    - fulano+de+tal@escola.ninja.br
				    """;

		PrintUtil.printResult(texto, "\\S+@\\w+\\.\\w{2,6}(\\.\\w{2})?");
	}

}