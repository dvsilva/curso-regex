package curso.regex.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileUtil {

	private static final String RESOURCES_PATH = "src\\main\\resources";
	private static final String FOLDER_ORIGINAIS = "originais";
	private static final String FOLDER_ALTERADOS = "alterados";

	public static String read(String nomeArquivo) throws IOException {
		ClassLoader classLoader = FileUtil.class.getClassLoader();
		
		String completeFilename = new StringBuilder()
				.append(FOLDER_ORIGINAIS)
				.append(File.separator)
				.append(nomeArquivo)
				.toString();
		
		InputStream inputStream = classLoader.getResourceAsStream(completeFilename);
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		
		StringBuilder resultStringBuilder = new StringBuilder();
		
		try (BufferedReader br = new BufferedReader(inputStreamReader)) {
			String line;
			
			while ((line = br.readLine()) != null) {
				resultStringBuilder.append(line).append("\n");
			}
		}
		
		return resultStringBuilder.toString();
	}

	public static void write(String nomeArquivo, String conteudoFinal)  throws IOException {
		
		String completeFilename = new StringBuilder()
				.append(System.getProperty("user.dir"))
				.append(File.separator)
				.append(RESOURCES_PATH)
				.append(File.separator)
				.append(FOLDER_ALTERADOS)
				.append(File.separator)
				.append(nomeArquivo)
				.toString();
		
	    BufferedWriter writer = new BufferedWriter(new FileWriter(completeFilename));
	    writer.write(conteudoFinal);
	    writer.close();
	}
	
}
