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