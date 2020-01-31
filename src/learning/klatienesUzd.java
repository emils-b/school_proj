package learning;

public class klatienesUzd {

	public static void main(String[] args) {
		//1.uzd
String text = "John: 8, Jim: 7, Donny: 4, Beth: 2, Scooby: 10, Shaggy: 2";
		
		getStudentInfo(text); 
		//2. uzdevuma 
		String[] register = {
			"John Doe - unknown. Lived in Scotland. Now in Australia",
			"Scooby Doo - war veteran. Lives in Cartoonland. Married to Michael Jordan",
			"Harry Potter - weird dude. Lived under the stairs. Now probably Dead",
			"Mary Poppins - not popping anymore. DEAD",
			"Al Capone - Sadly, but dead. Last years spent in Alcatraz",
			"Spriditis - Latvian warrior. Faught the Devil. Wealth: a lot. Location: unknown",
			"Terminator - Dead",
			"Mr. Pikachu - Studying arts of theology in the University of Weirdland. Still lives with Bulbasour",
		};
		//3. uzd
		String password = "iYhAyKiCyH!!iYhAyKiCyH11**";
		String uppers = "ABCDEFGHIJKLMNOPRSTUVZWXQY";
		
		boolean hasSpaces = password.contains(" ");
		String[] symbols = password.split("");
		int upperCount = 0;
		int lowerCount = 0;
		int numberCount = 0;
		int symbolCount = 0;
		if (!hasSpaces) {
			for (int i=0; i<symbols.length; i++) {
			String sym = symbols[i];
			/*if (uppers.contains(sym)) {
				upperCount++;
			}*/
			char s = password.charAt(i);
			if (isUpperCase(s)) {
				upperCount++;
			} else if (isLowerCase(s)) {
				lowerCount++;
			} else if (isNumber(s)) {
				numberCount++;
			} else symbolCount++;
		}
		}
		if (!hasSpaces && upperCount>=2 && lowerCount>=2 && numberCount>=3 && symbolCount>=2) 
			System.out.println("Parole der");
		else System.out.println("ievadi jaunu paroli");
				
		//2. uzd
		for (int i=0; i<register.length; i++) {
			String t = register[i];
			int dashPos = t.indexOf("-");
			String name = t.substring(0, dashPos).trim();
			//name = t.split("-")[0].trim();
			if (t.toLowerCase().contains("dead")) {
				System.out.println(name+" is dead");
			}
			//System.out.println(name);
		}
		
		//1.uzd.no klasēm
		
	}

	//1. uzdevums atsevišķā metodē.
	static void getStudentInfo(String info) {
		String[] students = info.split(",");
		int studentuCount = 0;
		double atzSum = 0;
		int labAtz = 0;
		String labAtzName = "";
		for (int i=0; i<students.length; i++) {
			studentuCount++;
			String stud = students[i].trim();
			String[] parts = stud.split(":");
			String name = parts[0];
			String gradeString = parts[1].trim();
			int grade = Integer.parseInt(gradeString);
			atzSum += grade;
			if (grade > labAtz) { 
				labAtz = grade;
				labAtzName = name;
			}
			//if (grade<4) {
			//System.out.println(name+" ir nesekmīgs");
			//System.out.println(name +" has grade " +grade);
		}
		double vidAtz = atzSum / studentuCount;
		System.out.println("Studentu skaits ir: "+studentuCount);
		System.out.println("Videja atzime ir: "+vidAtz);
		System.out.println (labAtzName+" ir labaka atzime");
	}
	//2.uzd
	
	//3.uzd
	static boolean isUpperCase(char symbol) {
		return symbol>=65 && symbol<=90;
	}
	
	static boolean isLowerCase(char symbol) {
		return symbol>=97 && symbol<=122;
	}
	
	static boolean isNumber(char symbol) {
		return symbol>=48 && symbol<=57;
	}
	
	static boolean isSymbol(char symbol) {
		return isUpperCase(symbol)==false && isLowerCase(symbol)==false && isNumber(symbol)==false;
	}

}
