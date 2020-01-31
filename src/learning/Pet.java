package learning;
//izveidots priekš praktiskaisDarbsKlasesObjekti
public class Pet {
	String name;
	String type;
	int age;
	Owner owner;
	
	public Pet(String name, String type, int age, Owner owner) {
		this.name = name;
		this.type = type;
		this.age = age;
		this.owner= owner;
	}
	
	public void getInfo() {
		System.out.println("This is " + this.name + ", he is " + this.age + 
				" years old and he is " + this.type);
	}
	
	public String toString(){
		return "This is "+this.name+". He is "+this.type+" and is "+this.age+" years old.";//+this.owner;
	}

}
