package myFirst;

public class const_p {
	int x;
	public const_p(int y) {
		x = y;
	}
	public static void main(String[] args) {
		const_p o1 = new const_p(20);
		System.out.println(o1.x);
	}
}
