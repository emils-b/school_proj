package learning;
//izveidots priekš praktiskaisDarbsKlasesObjekti
public class Owner {
	String name;
	String city;
	int age;
	//String animal;
	Pet pet;
	
	/*public Owner(String name, String city, int age, String animal) {
		this.name=name;
		this.city=city;
		this.age=age;
		this.animal=animal;*/
		
		public Owner(String name, String city, int age, 
				String petName, String petType, int petAge) {
			this.name=name;
			this.city=city;
			this.age=age;
			this.pet = new Pet(petName, petType, petAge, this);
			
	}
	
	public void getInfo() {
		System.out.println("The owner of " + /*this.animal + */" is " + this.name +
				". He is " + this.age + " years old and lives in " + this.city);
	}
	
	public void friendinfo() {
		System.out.println(this.name+" is 7 years old. His friend "+this.pet.name+
				" is "+this.pet.age+" years old "+this.pet.type+". "+this.name+
				" saw him first time as a present for his "+(this.age - this.pet.age)+ " birthday.");
	}
	
	public String toString(){
		return "This is "+this.name+". He lives in "+this.city+" and is "+this.age+" years old.";//+this.pet;
	}

}
