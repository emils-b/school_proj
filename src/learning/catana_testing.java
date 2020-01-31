package learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class catana_testing {

	public static void main(String[] args) {
		// System.out.println(scramble("katas", "steak"));
		// List<Integer> ts = new ArrayList<>(Arrays.asList(50, 55, 56, 57, 58));
		// System.out.println(chooseBestSum(163, 3, ts));
		// String str="lksafdlkjf";

		System.out.println(encode("   ()(   "));

		/*
		 * int[] arr= {1,2,3,10}; int till=3;
		 * System.out.println(solveSuperMarketQueue(arr, till));
		 */
	}

	static String encode(String word) {
		word=word.toLowerCase();
		String[] wordArr=word.split("");
		String newWord="";
		int counter=0;
		for (int i = 0; i < wordArr.length; i++) {
			for (int j = i+1; j < wordArr.length; j++) {
				if (wordArr[i].equals(wordArr[j])) {
					newWord+=")";
					//wordArr[j] = ")";
					counter++;
					break;
				}
			}
			//if (word.charAt(i) != ')') {
			if(counter==0) {
				//word = word.replace(word.charAt(i), '(');
				//wordArr[i] = "(";
				newWord+="(";
			} counter=0;
		}
		return newWord;
		//return Arrays.toString(wordArr);
	}

	/*
	 * public static boolean scramble(String str1, String str2) { boolean isPart =
	 * true; String[] arrStr1 = str1.split(""); String[] arrStr2 = str2.split("");
	 * if (arrStr1.length < arrStr2.length) return false; for (int i = 0; i <
	 * arrStr2.length; i++) { for (int j = 0; j < arrStr1.length; j++) { if
	 * (arrStr1[j].equals(arrStr2[i])) { arrStr1[j] = ""; arrStr2[i] = ""; break; }
	 * } if (!(arrStr2[i].equals(""))) { isPart=false; break; } } return isPart; }
	 */
	// 6x
	public static Integer chooseBestSum(int t, int k, List<Integer> ls) {
		int answ = 0;
		if (ls.size() < k)
			return answ;
		for (int i = 0; i < ls.size() - 3; i++) {
			int route = 0;
			boolean repeate = true;
			int j = 1;
			while (repeate) {
				int counter = 1;
				route = ls.get(i);
				while (counter < k) {
					route += ls.get(i + j);
					j = j + 1;
					counter++;
					if (j == ls.size() - k) {
						repeate = false;
						j = 1;
					}
					if (route > answ /* && route<=t */) {
						answ = route;
						System.out.println("test3");
					}
				}
			}
		}
		return answ;
	}

	/*
	 * public static int solveSuperMarketQueue(int[] customers, int n) { int[]
	 * result = new int[n]; for (int i = 0; i < customers.length; i++) { result[0]
	 * += customers[i]; Arrays.sort(result); } return result[n - 1]; }
	 */
}
