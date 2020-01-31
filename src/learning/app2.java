package learning;

import java.util.Arrays;

public class app2 extends app {

	public static void main(String[] args) {
		int[] masivsG = { 4, 5, -5, 6, -3, -8, 9, 8, 2, -1 };
		
		//1. uzd
		int a = 0;
		int b = 1;
		for (int i = 1; i < masivsG.length; i++) {
			if (masivsG[i] > 0) {
				b++;
			}
		}

		int[] masivsPoz = new int[b];

		for (int i = 0; i < masivsG.length; i++) {
			if (masivsG[i] <= 0) {
				continue;
			} else {
				masivsPoz[a] = masivsG[i];
				a++;
			}
		}

		System.out.println(Arrays.toString(masivsPoz));
		
		//2. uzd
		int[] masivsLiel = new int[masivsG.length + 1];
		int sum = 0;
		
		for (int i = 0; i < masivsG.length + 1; i++) {
			if (i < masivsG.length) {
			sum += masivsG[i];
			masivsLiel[i] = masivsG[i];
			} else {
				masivsLiel[i] = sum;
			}
		}
		System.out.println(Arrays.toString(masivsLiel));
		
		//3. uzd
		int mainigais1 = 10;
		int mainigais2 = 11;
		boolean irVert = false;
		
		for (int i = 0; i < masivsG.length; i++) {
			if (masivsG[i] == mainigais1 || masivsG[i] == mainigais2) {
				irVert = true;
				break;
			}
		}
		if (irVert) {
			System.out.println("Vertibas " + mainigais1 + " vai " + mainigais2 + " ir masiva \"masivsG\".");
		} else {
			System.out.println("Vertibas " + mainigais1 + " vai " + mainigais2 + " nav masiva \"masivsG\".");
		}
		
		//4. uzd
		int[] masivsMainits = { 2, 6, 9, -5, 0, 0, 8, -7, -3, 0 };
		for (int i = 0; i < masivsMainits.length; i++) {
			if (masivsMainits[i] == 0) {
				masivsMainits[i] = i;
			} else if (masivsMainits[i] < 0 ) {
				masivsMainits[i] = 0;				
			}
		}
		System.out.println(Arrays.toString(masivsMainits));
	}
}
