package learning;

import java.util.Arrays;

public class app {
	public static void main(String[] args) {
		//1.uzd
		String myString = "Test the string";
		int stringInt = 50;
		compareLength(myString, stringInt);
		
		//2.uzd
		int[] myArr = {2,2,2,2,2,2};
		System.out.println(findIfEq(myArr));
		
		//3.uzd
		int[] myArr2 = {22, 22, 22, 22, 22};
		getArrElSumm(myArr2);
		
		//4.uzd
		int[] myArr3 = {2, 3, 4, 5, 6};
		//System.out.println(Arrays.toString(createObj(myArr3)));
		appClass[] classArr=createObj(myArr3);
		System.out.println(classArr[0].int2);
		
	}
	public static void compareLength(String myString, int stringInt) {
		if (myString.length()>stringInt)
			System.out.println(myString);
		else System.out.println(myString.substring(0,1));
	}
	
	public static boolean findIfEq(int[] myArr) {
		boolean isEq = true;
		for (int i=0; i<myArr.length-1; i++) {
			if (myArr[i]!=myArr[i+1]) isEq=false;
		}
		return isEq;
	}
	//īsti nezinu kā domāts 3. uzd. šis atdot katra indeksa divciparu skaitļa abi ciparu summu
	public static void getArrElSumm(int[] myArr) {
		for (int i=0; i<myArr.length; i++) {
			System.out.println(myArr[i]%10+myArr[i]/10);
		}
	}
	
	/*public static void getArrElSumm(int[] myArr) {
		int sum = 0;
		for (int i=0; i<myArr.length; i++) {
			sum+=myArr[i];
		}
		System.out.println(sum);
	}*/
	
	public static appClass[] createObj (int[] myArr3) {
		int l = 0;
		for (int i = 0; i<myArr3.length; i++) {
			l++;
		}
		appClass[] classArr = new appClass[l];
		for (int i=0; i<myArr3.length; i++) {
			classArr[i] = new appClass(myArr3[i], i);
		}
		return classArr;
	}


}
