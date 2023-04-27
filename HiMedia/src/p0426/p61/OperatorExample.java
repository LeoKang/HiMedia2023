package p0426.p61;

public class OperatorExample {
	public static void main(String[] args) {
		int x = 3;
		int y = -4;
		int z = +5;

		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		int result1 = +y;
		int result2 = y;
		int result3 = -y;

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.print("A" + "B");
		System.out.printf("%d", 4);
	}
}
