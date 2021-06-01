package curso.regex.caracteres;

import curso.regex.util.PrintUtil;

public class DesafioListaArquivos {

	public static void main(String[] args) {
		String texto = "lista de arquivos mp3: jazz.mp3,rock.mp3,podcast.mp3,blues.mp3";

		PrintUtil.printResult(texto, "\\.mp3");

		PrintUtil.printResult(texto, "\\w+\\.mp3");
	}

}
