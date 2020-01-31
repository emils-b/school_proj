package learning;
//priekš arrayList_un_hashMap
public class ListClass {
	int income;
	int tax;
	String name;
	String surname;
	static int count=0;
	
	public ListClass(String name, String surname, int income, int tax) {
		this.name=name;
		this.surname=surname;
		this.income=income;
		this.tax=tax;
		count++;
	}
	
	public int getBruto() {
		return this.income+this.tax;
	}
	
	public void describe() {
		System.out.println(this.name+" "+this.surname+"'s income is "+this.income);
	}
	
	public boolean isUnder1000() {
		return (this.income<1000);
	}
	
	public static void clientCount() {
		System.out.println("Client count is "+count);
	}
	
	public boolean isTaxed() {
		return(this.tax>0);
	}

}
