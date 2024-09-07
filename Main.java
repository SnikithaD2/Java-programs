class Animal{
	public void move(){
		System.out.println("The Animal is moving slowly");
	}
	class Cheetah extends Animal{
		public void move(){
			System.out.println("Cheetah is running");
		}
	}
	class Main{
		public static void main(String[] args){
			Cheetah c = new Cheetah();
			c.move();
		}
	}
}
//error
//Main.java:12: error: non-static variable this cannot be referenced from a static context
//                        Cheetah c = new Cheetah();
//                                    ^
//Main.java:11: error: Illegal static declaration in inner class Animal.Main
//                public static void main(String[] args){
//                                   ^
//  modifier 'static' is only allowed in constant variable declarations
//2 errors