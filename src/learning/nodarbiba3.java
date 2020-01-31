package learning;

public class nodarbiba3 {

	public static void main(String[] args) {
		Student student1 = new Student("Jane", "Doe", 1, 18);
		Student student2 = new Student("Robert", "Swan", 1, 19);
		Student student3 = new Student("Jo", "Apple", 2, 21);
		Student student4 = new Student("Dj", "Pettle", "IT", 3, 22, 4, 4);
		Student student5 = new Student("Steave", "Withoutjob", "IT", 2, 20, 5, 7);
		Student student6 = new Student("Steave", "Bush", 1, 18);
		
		Student[] studentArray = {student1,student2,student3,student4,student5,student6};
		
		int sumOfAge = 0;
		
		for(int i=0; i<studentArray.length; i++) {
			System.out.println(studentArray[i].isPasToNextYear());
			System.out.println(studentArray[i].isImprovement());
			sumOfAge += studentArray[i].getAgeAtStart();
		}
		
		int avgAge = sumOfAge/studentArray.length;
		System.out.println("Student avg age is: " + avgAge);
		Student.getUniName();
		Student.getStudentTypesCount();
		
		//izveido metodi kam padod 2 parametrus, skaitļu masīvu un viens skaitlis un atgriež skaitu cik elementi masīvā dalās bez atlikuma ar padoto skaitli
	}
	
	

}
