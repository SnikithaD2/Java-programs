package myFirst;

public class factorial {
	public static void main(String[] args) {
		int n = 5, i;
		int fact = 1;
		for(i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}
}
