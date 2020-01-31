package learning;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class importPraktice {
	static int[][] studentGrades;
	static String[] studentNames;
	static String[] courses;
	static final String SEPARATOR = ";";

	public static void main(String[] args) {
		String pathToFile = "D:\\Downloads\\grades.csv";
		readStudentData(pathToFile);
		// Kad fails ielasīts, varam rēķināt no masīva visu ko.
		String firstStudent = studentNames[0];
		String fifthCourse = courses[5];
		System.out.println(firstStudent + " ir saņēmis " + studentGrades[0][5] + " kursā " + fifthCourse);
		printCourseNames();
	}

	static void readStudentData(String filePath) {
		Path pathObject = Paths.get(filePath);
		Charset charset = Charset.forName("UTF-8"); // Kodējums priekš LV burtiem
		int studentCount = 0;
		int courseCount = 0;
		try {
			List<String> lines = Files.readAllLines(pathObject, charset);
			// Nosaka dimensijas un izveido masīvus atbilstoši ==> Cik rindas -1 un 0.
			// rindai, cik tajā kolonnas -1
			studentCount = lines.size() - 1; // -1, jo noņem header rindu, tad pārējo rindu skaits ir studentu skaits
			courseCount = lines.get(0).split(SEPARATOR).length - 1; // 0. rindu sadala pēc semikoliem un uzzina, cik
																	// kolonnas. Noņem -1, jo 1 ir vārda kolonna
			studentGrades = new int[studentCount][courseCount]; // uztaisa jaunu 2D masīvu pēc atrastajiem izmēriem
			studentNames = new String[studentCount];
			courses = new String[courseCount];
			// Iet cauri katrai faila rindai. Atverot failu ar Notepad++ vai Sublime text,
			// var redzēt patieso faila saturu
			rowToCourseArray(lines.get(0).split(SEPARATOR));
			for (int row = 1; row < lines.size(); row++) {
				String line = lines.get(row);
				String[] cells = line.split(SEPARATOR); // sadala visu rindu masīvā (tā kā izskatās pa kolonnām)
				// 0. šūna pievienota studentu sarakstam, pārējās ciklā atzīmju sarakstam
				studentNames[row - 1] = cells[0];
				for (int col = 1; col < cells.length; col++) { // ciklā darbojas ar katru šūnu
					studentGrades[row - 1][col - 1] = getIntFromCell(cells[col]);
				}
				row++;
			}
			System.out.println(studentCount + " studenti saglabāti.");
			System.out.println("Katram " + courseCount + " atzīmes.");
		} catch (IOException e) {
			System.out.println(e);
		}
	}

//metode, kas saņem 0. rindu un saliek visu courses masīvā. Izlaiž 0. kolonnu, jo tā ir tukša.
	static void rowToCourseArray(String[] cells) {
		for (int i = 1; i < cells.length; i++) {
			courses[i - 1] = cells[i];
		}
		System.out.println(cells.length - 1 + " kursu nosaukumi saglabāti.");
	}

//no stringa mēģina atdot integer. ja fail, tad atdod 0
	static int getIntFromCell(String cell) {
		try {
			int value = Integer.parseInt(cell);
			return value;
		} catch (Exception e) { // ja nesanāk noparsēt un atgriezt šo, tad atdos vnk nulli.
			return 0;
		}
	}

	static void printCourseNames() {
		System.out.println("Šeit māca: ");
		for (int i = 0; i < courses.length; i++) {
			System.out.println(" -> " + courses[i]);
		}
	}

}
