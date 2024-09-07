class cat1{
	String name = "Unknown";
	int age = 0;
	void cat1(String Name, int Age) {
		name = Name;
		age = Age;
	}
}
class cat{
	public static void main(String[] args){
		cat1 c1 = new cat1();
		c1.cat1("cutie", 5);
		System.out.println(c1.name + " " + c1.age);
	}
}