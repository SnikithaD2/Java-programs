package myFirst;

public class largeSmall {
	public static void main(String[] args) {
		int a[5];
		a[0] = 5;
		a[1] = 30;
		a[2] = 20;
		a[3] = 15;
		a[4] = 7;
		int min = a[0];
		int max = a[0];
		for(int i = 0; i < 5; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
	}
}
