package p447;

public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
		if (args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];

			System.out.println("args[0]:" + data1);
			System.out.println("args[1]:" + data2);
		}
	}
}
