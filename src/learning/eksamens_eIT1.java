package learning;

import java.util.Arrays;

public class eksamens_eIT1 {

	public static void main(String[] args) {
	//1.uzd	
		short[] arrShort = {1,2,3,4,-5,-6};
		System.out.println(printArrayPositiveCount(arrShort));
	//2.uzd
		int duck1 = 1;
		int duck2 = 2;
		int duck3 = 3;
		int duck4 = 4;
		System.out.println(Arrays.toString(getDucksInOrder(duck1, duck2, duck3, duck4)));
	//3.uzd
		String longString="BANanaaa";
		String shortString="a";
		System.out.println(findMyBoys(longString, shortString));
	//4.uzd
		int[] arr1 = {1,2,-3,5};
		int[] arr2 = {1,2,-3};
		System.out.println(Arrays.toString(getCorrectInmates(arr1, arr2)));
	//5.uzd
		int[][] arr2D= {
				{0,-2,8,4},
				{5,3,8,-2},
				{-3,4,5,-6},
				{1,-4,7,5},
		};
		System.out.println(Arrays.deepToString(fixThatList(arr2D)));
		
	}
	//1.uzd
	public static int printArrayPositiveCount(short[] arr) {
		int posCount=0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]>0) posCount++;
		}
		return posCount;
	}
	//2.uzd jāuzlabo
	public static int[] getDucksInOrder(int a, int b, int c, int d) {
		int[] arrInOrder= {a,b,c,d};
		int int0 = 0;
		for (int i=0; i<arrInOrder.length; i++) {
			if (arrInOrder[i]>int0) int0=arrInOrder[i];
		}
		int int1 = getHighestInt(int0, arrInOrder);
		int int2 = getHighestInt(int1, arrInOrder);;
		int int3 = getHighestInt(int2, arrInOrder);;
		int[] newArrInOrder= {int0,int1,int2,int3};
		return newArrInOrder;
		}
	
	public static int getHighestInt (int a, int[] arr) {
		int int1=0;
		for (int i=0; i<arr.length; i++) {
			if (arr[i]>int1 && arr[i]<a) int1=arr[i];
		} return int1;		
	}
	
	//3.uzd jāpaskatās vai var vēl metodēs sadalīt
	public static int findMyBoys(String longStr, String shortStr) {
		int counter = 0;
		String longS=toUppercase(longStr);
		String shortS=toUppercase(shortStr);
		String[] splitL=longS.split("");
		String newStr="";
		for (int i=0; i<splitL.length; i++) {
			if (splitL[i].equals(shortS)) counter++;
			else newStr+=splitL[i];
		}
		System.out.println(newStr.toLowerCase());
		return counter;
	}
	
	public static String toUppercase (String str) {
		return str.toUpperCase();
	}
	//4. uzd jāsadala vēl atsevišķās metodēs
	public static int[] getCorrectInmates(int[] arr1, int[] arr2){
		int shortest=0;
		if (arr1.length<arr2.length) shortest=arr1.length;
		else shortest=arr2.length;
		int[] newInt = new int[getArrLeng(arr1, arr2, shortest)];
		int index=0;
		for (int i=0; i<shortest; i++) {
			if (arr1[i]==arr2[i]) {
				newInt[index]=arr1[i];
				index++;
			}
		}
		System.out.println("Masīvu summu starpība ir: " + Math.abs((getSumm(arr1)-getSumm(arr2))));
		return newInt;
	}
	
	//šī metode atgriež indexu skaitu masīvā
	public static int getArrLeng(int[] arr1, int[] arr2, int shortest) {
		int c=0;
		for (int i=0; i<shortest; i++) {
			if (arr1[i]==arr2[i]) c++;
		} return c;
	}
	
	//šī metode atgriž masīva summu
	public static int getSumm(int[] a) {
		int summ=0;
		for (int i=0; i< a.length; i++) {
			summ+=a[i];
		} return summ;
	}
	
	//5.uzd
	public static int[][] fixThatList(int[][] arr){
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				if (arr[i][j]==(i*j)*(i*j)*(i*j)) {
					arr[i][j]=j;
				} if (arr[i][j]<0) {
					arr[i][j]=j-i;
				} if(arr[i][j]<0 && arr[i][j]%2==0) {
					arr[i][j]=0;
					System.out.println("Skaitlis "+i+". rindā un "+j+". kolonnā tiek aizstāts ar 0.");
				}
			}
		}
		return arr;
	}
	

}
