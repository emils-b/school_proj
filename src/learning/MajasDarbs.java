package learning;

import java.util.Scanner;

public class MajasDarbs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 1.uzd
		int[] myArray = { 2, 3, 6, 9, -8, 7, -4, 0, -1 };
		System.out.println(isPositiveMore(myArray));
		// 2.uzd
		String myString = "Lets test this short string";
		getLongWords(myString);
		// 3.uzd
		System.out.print("\nLūdzu ievadiet skaitli, kuru vēlaties kāpināt: ");
		int skaitlis = input.nextInt();
		System.out.print("Lūdzu ievadiet skaitli ar kuru vēlaties kāpināt: ");
		int kapinatajs = input.nextInt();
		getPow(skaitlis, kapinatajs);
		input.close();

	}

	// 1.uzd
	public static boolean isPositiveMore(int[] a) {
		int pos = 0;
		int neg = 0;
		boolean posOrNeg;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) pos++;
			if (a[i] < 0) neg++;
		}
		if (pos>neg) posOrNeg = true;
		else posOrNeg = false;
		return posOrNeg;
		/*if (neg < pos)
			System.out.println(true);
		else
			System.out.println("Pozitīvo vērtību nav vairāk kā negatīvo");*/
	}

	// 2.uzd
	public static void getLongWords(String a) {
		String[] splitA = a.split(" ");
		for (int i = 0; i < splitA.length; i++) {
			if (splitA[i].length() > 4)
				System.out.print(splitA[i] + " ");
		}
	}

	// 3.uzd
	public static void getPow(int a, int b) {
		if (b > 0)
			System.out.println("Rezultāts ir: " + Math.pow(a, b));
		if (b < 0)
			System.out.println("Es šādi neprotu.");
		if (b == 0)
			System.out.println("Rezultāts ir: " + 1);
	}
}
