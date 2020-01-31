package learning;

public class nodarbiba {

	public static void main(String[] args) {
	//1. uzd
	int pirmais = 3;
	int otrais = 2;		
	int largest = getLargest(pirmais,otrais);
	System.out.println(largest);
	
	//2. uzd
	int[] array = {2, 3, 8, 9, -5, 6};
	int arraySum = getArraySum(array);
	System.out.println(arraySum);
	//3.uzd
	int arrayPositiveSum = getArrayPositiveSum(array);
	System.out.println(arrayPositiveSum);
	//4. uzd
	int b = 2;
	int z = 5;
	int arraySumBetween = getArraySumBetween(array, b, z);
	System.out.println(arraySumBetween);
	
	//5.uzd
	int age = 17;
	String name = "Janis";
	boolean isVip = false;
	enterClub(age, name, isVip);
	
	//6. uzd
	 System.out.println(containsArrayNegative(array));

	}
	//1.uzd
public static int getLargest (int a, int b) {
	if (a>b) return a;
	if (b>a) return b;
	return 0;
}
	//2.uzd
 public static int getArraySum (int[] a) {
	 int sum = 0;
	 for (int i = 0; i<a.length; i++) {
		 sum += a[i];
	 } return sum;
 }
 //3.uzd
 public static int getArrayPositiveSum (int[] a) {
	 int sum = 0;
	 for (int i = 0; i<a.length; i++) {
		 if(a[i]>0) {
			 sum += a[i]; 
		 }		
	 } return sum;
 }
 //4.uzd
 public static int getArraySumBetween (int[] a, int b, int z) {
	 int sum = 0;
	 for (int i = b; (i>=b) && (i<z); i++) {
			 sum += a[i]; 	
	 } return sum;

 }
 /* 4. uzd labāks variants
  public static int getArraySumBetween (int[] a, int b, int z) {
	 int sum = 0;
	 for (int i = 0; i<a.length; i++) {
	 if (isInclusive(array[i], b, z)) {
		 sum += a[i];
		 }
	 } return sum;}
	 static boolean isInclusive(int val, int from, int to) {
	 boolean is = val>=from && val<to;
	 return is;}
  */
 
 //5.uzd
 public static void enterClub(int age, String name, boolean isVip) {
	 int ageLimit = 18;
	 if(isVip) {
		 System.out.println(name + " you are VIP, welcome!");
		 return;
	 } 
	 if(age>=ageLimit){
	 System.out.println(name + " you are welcome!");
 } else {
	 System.out.println(name + " go home!");
 }
 }
 //6.uzd
 public static boolean containsArrayNegative(int[] a) {
	 for (int i = 0; i<a.length; i++) {
		 if (a[i] < 0) {
			 return true;
		 } 
	 } return false;
 }
}
