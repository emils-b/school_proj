package learning;

public class gatavosanas_ex {

	public static void main(String[] args) {
		// 1.uzd.
		double[] doubleArray = { 2.5, 2.6, -9.6, 8.6, 1.1, 4.5 };
		printArrayMinAndMax(doubleArray);
		// 2.uzd.
		int[] intArray = { 2, 6, -9, 8, 1, 4, 10, -6, -1, 5 };
		int intFrom = 1;
		int intTo = 6;
		int avgInRange = getArrayAvgInRange(intArray, intFrom, intTo);
		System.out.println("Avg sum in array in given range is: " + avgInRange);
		// 3.uzd.
		String myString = "Trying to find longest word";
		printLongestWord(myString);
		// 4.uzd.
		int[] arrayOnlyPos = {5, 6, 8, 4, 8, 7, 6, 0};
		System.out.println(isArrayPositive(arrayOnlyPos));
		// 5.uzd.
		int myInt = 0;
		
		System.out.println(getPowerAfter100(myInt));
		
		//6.uzd
		int int1 = 5;
		int int2 = 10;
		int int3 = 15;
		System.out.println(isDifEq(int1, int2,int3));
		

	}

	// 1.uzd
	public static void printArrayMinAndMax(double[] array) {
		double min = array[0];
		double max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min)
				min = array[i];
			if (array[i] > max)
				max = array[i];
		}
		System.out.println("Min num. in array is: " + min);
		System.out.println("Max num. in array is: " + max);
	}
	
	// 2.uzd
	public static int getArrayAvgInRange(int[] array, int from, int to) {
		int sum = 0;
		int count = 0;
		for (int i = 0; i<array.length; i++) {
			if (array[i]>from && array[i]<to) {
				sum+=array[i];
				count++;
			}
		}
		return sum/count;
	}
	
	//3.uzd.
	public static void printLongestWord(String myString) {
		String longestWord = "";
		String[] myStringArray = myString.split(" ");
		for (int i=0; i<myStringArray.length; i++) {
			if (myStringArray[i].length()>longestWord.length()) 
				longestWord=myStringArray[i];
		}
		System.out.println(longestWord);
	}
	//4.uzd
	public static boolean isArrayPositive(int[] array) {
		boolean isPos = true;
		for (int i=0; i<array.length; i++) {
			if (array[i] < 0) isPos=false;
		}
		return isPos;
	}
	//5.uzd nešķiet labs risinājums
	public static int getPowerAfter100(int a) {
		int pow = 1;
		int result = a;
		if (a==1 || a==-1 || a==0) {
			System.out.println("This num can't reach 100.");
			pow = 0;
			return pow;
		}
		while (result<=100) {
			result *= a;
			pow ++;
		}
		return pow;
	}
	//6. uzd
	public static boolean isDifEq(int a, int b, int c) {
		boolean isDifEq = false;
		int difBA = b-a;
		int difCB = c-b;
		if (difBA==difCB) isDifEq=true;
		if (a>b || b>c) System.out.println("Num should be in ascending oredr.");
		return isDifEq;
	}

}
