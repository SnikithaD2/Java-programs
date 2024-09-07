class Dog{
	String name = "Unknown";
	String color = "Unknown";
	void Dog(String Name, String Color){
		name = Name;
		color = Color;
	}
	public static void main(String[] args){
		Dog d1 = new Dog();
		d1.Dog("Puppy", "Brown");
		System.out.println(d1.name + " is " + d1.color + " in color.");
	}
}