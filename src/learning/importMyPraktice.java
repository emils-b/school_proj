package learning;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class importMyPraktice {
	static final String SEPARATOR = ",";

	public static void main(String[] args) {
		String pathToFile = "D:\\Downloads\\users.csv";
		readStudentData(pathToFile);

	}
	
	public static void readStudentData(String filePath) {
		Path pathObject = Paths.get(filePath);
		Charset charset = Charset.forName("UTF-8");
		int userCount = 0;
		int monthCount = 0;
		try {
			List<String> lines = Files.readAllLines(pathObject, charset);
			userCount = lines.size() - 1;
			monthCount = lines.get(0).split(SEPARATOR).length - 1;
			System.out.println(userCount);
			System.out.println(monthCount);
		}catch (IOException e) {
		System.out.println(e);
		}
	}
}
