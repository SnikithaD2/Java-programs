package myFirst;

public class constructor {
	int x;
	public constructor() {
		x = 10;
	}
	public static void main(String[] args) {
		constructor o1 = new constructor();
		System.out.println(o1.x);
	}
}
