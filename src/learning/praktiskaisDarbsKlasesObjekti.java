package learning;

public class praktiskaisDarbsKlasesObjekti {
	public static void main(String[] args) {
		//priekš šī ir klase Owner un Pet
		//Owner owner1 = new Owner("Jo", "NY", 25, "dog");
		//Owner owner2 = new Owner("Jim", "LA", 30, "cat");
		//Pet pet1 = new Pet ("Snuffles", "dog", 5);
		//Pet pet2 = new Pet ("Snow", "cat", 3);
		
		Owner owner1 = new Owner("Jo", "NY", 25, "Snuffles", "dog", 5);
		Owner owner2 = new Owner("Jim", "LA", 30, "Snow", "cat", 3);
		//owner1.getInfo();
		//owner2.getInfo();
		//System.out.println(owner1.pet.name);
		//System.out.println(owner2.pet.owner.pet.owner.pet.name);
		
		System.out.println(owner2.pet);
		System.out.println(owner2);
		//owner1.friendinfo();
		//pet1.getInfo();
		//pet2.getInfo();
		
	}

}
