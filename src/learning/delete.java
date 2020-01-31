package learning;

public class delete {

	public static void main(String[] args) {
		int[] arr1 = { 5, -6, 8, -7, 1, -4, -5 };
		int[] arr2 = { 7, 5, 4, 1, 0, -8, -7, -3 };
		int[] arr3 = { 7, 5, 1, 2, 0, 4, -5, -7, -4 };
		int int1 = 5;
		int int2 = 1;
		int int3 = 8;
		int int4 = -8;
		String MyString = "DOES Contain all uppercase letters?";
		System.out.println(getArrWithPos(arr1, arr2));
		System.out.println(isAvgOwer100(arr1, arr2, arr3));
		System.out.println(isOneNegative(int1, int2, int3, int4));
		System.out.println(getSum(int1, int3));
		System.out.println(isAllUppercase(MyString));
		System.out.println(countOfUppercWords(MyString));

	}

	// 1.
	public static int[] getArrWithPos(int[] arr1, int[] arr2) {
		if (getPosCountInArr(arr1) > getPosCountInArr(arr2))
			return arr1;
		return arr2; // nepieļauj iespēju, ka ir vienāds pozitīvo elemntu skaits.
	}

	public static int getPosCountInArr(int[] arr) {
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0)
				counter++;
		}
		return counter;
	}

	// 2.
	public static boolean isAvgOwer100(int[] arr1, int[] arr2, int[] arr3) {
		if (getAvg(arr1) > 100 || getAvg(arr2) > 100 || getAvg(arr3) > 100)
			return true;
		else
			return false;
	}

	public static int getAvg(int[] arr) {
		int count = 0;
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] += count;
			counter++;
		}
		return count / counter;
	}

	// 3.
	public static boolean isOneNegative(int a, int b, int c, int d) {
		if (isNegative(a) || isNegative(b) || isNegative(c) || isNegative(d))
			return true;
		else
			return false;
	}

	public static boolean isNegative(int a) {
		if (a < 0)
			return true;
		else
			return false;
	}

	// 4.
	public static int getSum(int a, int b) {
		int sum = 0;
		int myInt = a + 1;
		while (myInt < b) {
			if (myInt % 7 == 0) {
				sum += myInt;
			}
			myInt++;
		}
		return sum;
	}

	// 5.
	public static boolean isAllUppercase(String myString) {
		if (myString.equals(myString.toUpperCase()))
			return true;
		else
			return false;
	}

	// 6.
	public static int countOfUppercWords(String myString){
		int counter=0;
		String[] myStringArray = myString.split(" ");
		for (int i=0; i<myStringArray.length; i++) {
			if (isAllUppercase(myStringArray[i])) counter++;
			}
		return counter;
		}

}

