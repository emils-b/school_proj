package learning;

public class Student {
	String name;
	String surname;
	String major;
	int age;
	int year;
	int coursesCountThisYear;
	double mediumGradeLastYear;
	double mediumGradeThisYear;
	String studentType;
	static String[] studentTypes = {"1st year", "2nd year", "3rd year", "other"};
	static int studentCount = 0;
		
	public Student(String name, String surname, int year, int age) {
		this.name = name;
		this.surname = surname;
		this.age = year;
		this.age = age;
		studentCount++;
		//System.out.println("student count: " + studentCount);
	}
			
	public Student(String name, String surname, String major, int year, int age, 
			int mediumGradeLastYear, int mediumGradeThisYear) {
		this.name = name;
		this.surname = surname;
		this.major = major;
		this.age = age;
		this.year = year;
		this.mediumGradeLastYear = mediumGradeLastYear;
		this.mediumGradeThisYear = mediumGradeThisYear;
		studentCount++;
		//System.out.println("student count: " + studentCount);
	}
		
	public String isPasToNextYear() {
		if(this.mediumGradeThisYear >= 4.0) {
			return this.name + " " + this.surname+ " passes to the next year";
		} if(this.mediumGradeThisYear < 4.0) 
			return this.name + " " + this.surname+ " must repeat this year";
		else return "No data about medium grade: " + this.name + " " + this.surname ;
	}
	
	public int getAgeAtStart() {
		int ageAtStart = this.age - this.year;
		return ageAtStart;
	}
	
	//te īsti nesanāk normāli metodi izveidot, lai atgriež normālu atbildi, ja nav objektam pievienotu datu. 
	//Baigo piņķeri izveidoju priekš isImprovement()
	public boolean isGrades() {
	boolean grades;
	if (this.mediumGradeThisYear == 0 && this.mediumGradeLastYear == 0) grades = false;
	else grades = true;
	return grades;
	}
	
	public String isImprovement() {
		String answer = "";
		if (!isGrades()) answer =  this.name + " " + this.surname+ " has no data about grades";
		if ((this.mediumGradeThisYear - this.mediumGradeLastYear) > 0 && isGrades())
			answer = this.name + " " + this.surname+ " grades has improved.";
		if ((this.mediumGradeThisYear - this.mediumGradeLastYear) <= 0 && isGrades())
			answer =  this.name + " " + this.surname+ " grades hasn't improved.";
		return answer;
	}
	
	
	public int getStudentCount() {
		return studentCount;
	}
	
	public static void getUniName() {
		System.out.println("Name of this University is \"Best University\".");
	}
	
	public static void getStudentTypesCount() {
		int count = 0;
		for (int i = 0; i<studentTypes.length; i++) {
			count++;
		}
		System.out.println("Posible student type count: " + count);
	}
}
