package learning;

public class app3 {

	public static void main(String[] args) {
	//1. uzd
	int[] masivs1 = {2, 4, 6, 8, 10};
	int[] masivs2 = {2, 3, 5, 9, 11};
	System.out.println(metode1(masivs1, masivs2));
	
	//2.uzd
	int mainigais1 = 3;
	int mainigais2 = 3;
	System.out.println(metode2(mainigais1, mainigais2));
	
	//3.uzd
	int[] masivs3 = {1, -3, -6, 8, 9, -4, 4};
	metode3(masivs3);
	
	//4.uzd
	int skaitlis = 6;
	int robeza1 = 2;
	int robeza2 = 9;
	System.out.println("\n" + metode4(skaitlis, robeza1, robeza2));
	//5.uzd
	int[] masivs4 = {-2, 6, 8, 7, 1, -5, 9, -6, 2, 0, 11, 66};
	metode5(masivs4, robeza1, robeza2);
	}
	
	//1.uzd.
	public static boolean metode1(int[] a, int[] b) {
		int sum1 = 0;
		int sum2 = 0;
		for (int i=1; i<a.length; i++) {
			sum1 += a[i];
		}
		for (int i=1; i<b.length; i++) {
			sum2 += b[i];
		}
		if (sum1 == sum2) {
			return true;
		} else {
			return false;
		}
	}
	//2.uzd
	public static int metode2(int a, int b) {
		int rez = 1;
		if (b == 0) {
			rez = 1;
		} else {
			for (int i = 1; i<=b; i++) {
				rez *= a;
			}
		}
		return rez;
	}
	//3.uzd
	public static void metode3(int[] a) {
		for (int i=0; i<a.length; i++) {
			if(a[i]<0) {
				System.out.print(a[i] + " ");
			}
		}
	}
	//4.uzd
	public static boolean metode4(int a, int b, int c) {
		if ((a>b && a<c) || (a>c && a<b)) {
			return true;
		} else {
			return false;
		}
	}
	//5.uzd
	public static void metode5(int[] a, int b, int c) {
		for (int i = 0; i<a.length; i++) {
			if ((a[i]>b && a[i]<c) || (a[i]>c && a[i]<b)) {
				System.out.print(a[i] + " ");
			}
		}
	}
	
}
