package sec02.exam10;

public class ContinueExample {
	public static void main(String[] args) {
		System.out.println("t");
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				break;
			}
			System.out.println(i);
		}
	}
}
