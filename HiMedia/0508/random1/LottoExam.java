package random1;

public class LottoExam {
	public static void main(String[] args) {
		boolean f = false;
//		int num1, num2, num3, num4, num5, num6;
		int[] num = new int[6];
		do {
			f = false;
			// 1. 6개의 난수 추출
//			int num1 = 1, num2 = 2, num3 = 1, num4 = 4, num5 = 5, num6 = 6;
//			num1 = (int) (Math.random() * 45) + 1;
//			num2 = (int) (Math.random() * 45) + 1;
//			num3 = (int) (Math.random() * 45) + 1;
//			num4 = (int) (Math.random() * 45) + 1;
//			num5 = (int) (Math.random() * 45) + 1;
//			num6 = (int) (Math.random() * 45) + 1;
			for (int i = 0; i < num.length; i++) {
				num[i] = (int) (Math.random() * 45) + 1;
			}

//			System.out.print(num1 + " ");
//			System.out.print(num2 + " ");
//			System.out.print(num3 + " ");
//			System.out.print(num4 + " ");
//			System.out.print(num5 + " ");
//			System.out.println(num6);
			for (int i = 0; i < num.length; i++) {
				System.out.print(num[i] + " ");
			}
			System.out.println();

//			if (num1 == num2 || num1 == num3 || num1 == num4 || num1 == num5 || num1 == num6) { // 1st
//				f = true;
//			} else if (num2 == num3 || num2 == num4 || num2 == num5 || num2 == num6) { // 2nd
//				f = true;
//			} else if (num3 == num4 || num3 == num5 || num3 == num6) { // 3rd
//				f = true;
//			} else if (num4 == num5 || num4 == num6) { // 4th
//				f = true;
//			} else if (num5 == num6) { // 5th
//				f = true;
//			}
			for (int i = 0; i < num.length; i++) {
				for (int j = 0; j < num.length; j++) {
					if (i != j && num[i] == num[j]) {
						f = true;
					}
				}
			}
		} while (f);
	}
}
