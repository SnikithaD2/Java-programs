package myFirst;

public class prime {
	public static void main(String[] args) {
		int i;
		int j = 0;
		int n = 43;
		for(i = 2; i < 43; i++) {
			if(n %  i == 0) {
				j = j + 1;
			}
		}
		if(j == 0) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
	}
}
