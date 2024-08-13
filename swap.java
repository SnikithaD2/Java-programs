package myFirst;

public class swap {
	public static void with_t() {
		int a = 10;
		int b = 25;
		int t;
		t = a;
		a = b;
		b = t;
		System.out.println("a" + " = " + a);
		System.out.println("b" + " = " + b);
	}
	public static void without() {
		int a = 15;
		int b = 30;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a" + " = " + a);
		System.out.println("b" + " = " + b);
	}
	public static void main(String[] args) {
		with_t();
		without();
	}
}
