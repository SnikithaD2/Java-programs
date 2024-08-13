package myFirst;

public class palindrome {
	public static void main(String[] args) {
		int x = 12321;
		int n = x;
		int y = 0;
		while(x > 0) {
			int r = x % 10;
			y = y * 10 + r;
			x = x / 10;
		}
		if(n==y) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
}
