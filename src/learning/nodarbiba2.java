package learning;

import java.util.Arrays;

public class nodarbiba2 {

	public static void main(String[] args) {
		// 1.uzd
		String teksts = "Vai saja string ir vairakas vai vertibas, vai nav";
		String atrodamaVertiba = "vai";
		System.out.println(getVertibuSk(teksts, atrodamaVertiba));
		// 2.uzd
		int[][] array2d = { { -2, 1, 3 }, { 3, -2, -1 }, { 1, 2, 3 }, };
		System.out.println(getNegElem(array2d));
		System.out.println(Arrays.toString(getNegAndPozElem(array2d)));
		// 3.uzd
		int[] array1 = { -3, 0, 1, 2, 3 };
		System.out.println(getCountOf3(array1));
		// 4.uzd
		System.out.println(isArrayIncreasing(array1));
		// 5.uzd
		int[] array2 = { 10, 11, 4, 4, 3, 5, 4, 4, 4 };
		int intInAr = 4;
		System.out.println(isNumNext(array2, intInAr));
		// 6.uzd
		String myString = "abckljkkhbcba";
		getLongestPart(myString);
	}

	// 1.uzd
	public static int getVertibuSk(String a, String b) {
		String[] parts = a.split(b);
		int reizuSk = parts.length - 1;
		return reizuSk;
	}

	// 2.uzd. 1.vers
	public static int getNegElem(int[][] a) {
		int negSk = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] < 0) {
					negSk++;
					break;
				}
			}
		}
		return negSk;
	}

	// 2.uzd 2.vers
	public static int[] getNegAndPozElem(int[][] a) {
		int negSk = 0;
		int pozSk = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] < 0) {
					negSk++;
				}
				if (a[i][j] > 0) {
					pozSk++;
				}
				break;
			}
		}
		int[] array = { negSk, pozSk };
		return array;
	}

	// 3.uzd
	public static boolean getCountOf3(int[] a) {
		boolean isCount3 = false;
		int count3 = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 3) {
				count3++;
			}
		}
		if (count3 == 3)
			isCount3 = true;
		return isCount3;
	}

	// 4.uzd
	public static boolean isArrayIncreasing(int[] a) {
		boolean isIncreasing = false;
		for (int i = 1; i < a.length; i++) {
			if (a[i] > a[i - 1]) {
				isIncreasing = true;
			} else {
				isIncreasing = false;
				break;
			}
		}
		return isIncreasing;
	}

	// 5.uzd
	public static int isNumNext(int[] a, int b) {
		int nextCount = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b && a[i - 1] == b) {
				nextCount++;
				continue;
			}
			if (a[i] == b) {
				nextCount = 1;
			}
		}
		return nextCount;
	}

	// 6. uzd nesanāk uzrakstīt neizmantojot .equals()
	public static void getLongestPart(String myString) {
		String[] splitString = myString.split("");
		String longestPart = "";
		int j = 1;
		for (int i = 0; i < splitString.length/2; i++) {
			if (splitString[i].equals(splitString[splitString.length - j])) {
				longestPart += splitString[i];
				j++;
			}
		}
		System.out.println(longestPart);
	}

}
