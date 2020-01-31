package learning;

public class paskontroles_uzd {

	public static void main(String[] args) {
		// 1.1uzd
		int mainInt = 5;
		int boarderInt1 = 2;
		int boarderInt2 = 30;
		boolean isBetween = isSquareBetween(mainInt, boarderInt1, boarderInt2);
		System.out.println(isBetween);
		//1.2uzd
		int[] arrayMainInt = {2, 6, 8, -4, -2, 9, 10, -7};
		int sqCount = getSquareCountBetween(arrayMainInt, boarderInt1, boarderInt2);
		System.out.println(sqCount);
		//2.uzd
		String myString = "parbauda Kuri Vardi sakas ar Lielo burtu";
		getWord(myString);
		//3.uzd
		String strWithBadWords = "I really love Sex and Alcohol";
		String[] arrayWithBadWords = {"Sex", "Alcohol"};
		censor(strWithBadWords, arrayWithBadWords);
		//4.1uzd
		int[] array1 = {1, 2, 3, -6, 5};
		boolean isPositive = isRowPositive(array1);
		System.out.println(isPositive);
		//4.2uzd
		int[][] my2DArray = {
				{1, 3, -6, 2, -3},
				{2, 4, -5, 1, -3},
				{3, 5, -4, 1, -3},
				{4, 6, -3, 3, -1},
				{5, 7, -2, 4, -2},
				{6, 8, -1, 4, -3},
				{7, 9, 0, 5, -7},
				{8, 10, -7, -1, -8},
				{9, 2, -8, -3, -4},
				{2, 1, -9, 2, -4},
		};
		double positivePercent = getArrayPositiveRate(my2DArray);
		System.out.println(positivePercent + "%");
		//5.uzd
		int boarder1 = 15;
		int boarder2 = 6;
		System.out.println(getSum(boarder1, boarder2));

	}

	// 1.1uzd
	public static boolean isSquareBetween(int mainInt, int a, int b) {
		boolean isBetween = false;
		int mainIntSq = mainInt * mainInt;
		if((mainIntSq>a && mainIntSq<b) || (mainIntSq>b && mainIntSq<a)) {
			isBetween = true;
		}
		return isBetween;
	}
	//1.2uzd
	public static int getSquareCountBetween(int[] array, int a, int b) {
		int sqCount = 0;
		for (int i=0; i<array.length; i++) {
			if(isSquareBetween(array[i], a, b)) sqCount++;
		}
		return sqCount;
	}
	//2.uzd
	public static void getWord(String a) {
		String[] myStringArray = a.split(" ");
		for (int i = 0; i<myStringArray.length; i++) {
			if (myStringArray[i] != myStringArray[i].toLowerCase()) {
				System.out.println(myStringArray[i]);
			}
		}
	}
	//3.uzd
	public static void censor(String a, String[] b) {
		String strWithoutBadWords=a;
		for (int i=0; i<b.length; i++) {
			String replacement = "";
			for (int j = 0; j<b[i].length() ;j++) {
				replacement += "x";
			}
			strWithoutBadWords=strWithoutBadWords.replace(b[i], replacement);
		}
		System.out.println(strWithoutBadWords);
	}
	//4.1uzd
	public static boolean isRowPositive(int[] a) {
		boolean isPositive = false;
		int summ = a[0];
		for (int i = 1; i<a.length; i++) {
			summ += a[i];
		}
		if (summ>0) isPositive = true;
		return isPositive;
	}
	//4.2uzd
	public static double getArrayPositiveRate(int[][] a) {
		double rowCount = 0;
		double posRowCount = 0;
		for (int i = 0; i<a.length; i++) {
			rowCount++;
			if (isRowPositive(a[i])) posRowCount++;
		}
		double posPercent = posRowCount / rowCount * 100;
		return posPercent;
	}
	//5.uzd
	public static int getSum(int a, int b) {
		int sum = 0;
		if (a<b) {
			for (int i=a; i<=b; i++) {
				if (!(i%10 == 0)) sum += i;
		}
		} if (a>b) {
			for (int i=b; i<=a; i++) {
				if (!(i%10 == 0)) sum += i;
			}
		}
		return sum;
	}
}
