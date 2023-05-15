package sec02.exam05;

public class ForMultiplicationTableExample {
	public static void main(String[] args) {

		for (int m = 3; m <= 4; m++) {
			System.out.println("*** " + m + "단 ***");
			for (int n = 5; n <= 7; n++) {
				System.out.println(m + " X " + n + " = " + (m * n));
			}
		}
	}
}
