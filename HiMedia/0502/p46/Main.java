package p46;

public class Main {
	public static void main(String[] args) {
		int[] scores = { 83, 90, 87, 79, 56, 89 };

		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "] : " + scores[i]);
		}

//		System.out.println("scores[0] : " + scores[0]);
//		System.out.println("scores[1] : " + scores[1]);
//		System.out.println("scores[2] : " + scores[2]);
//		System.out.println("scores[3] : " + scores[3]);

		int sum = 0;
//		for (int i = 0; i < scores.length; i++) {
//			sum += scores[i];
//		}
		sum += scores[0];
		sum += scores[1];
		sum += scores[2];
		sum += scores[3];
		sum += scores[4];
		sum += scores[5];
		

		System.out.println("sum : " + sum);
		double avg = (double) sum / scores.length;
		System.out.println("avg : " + avg);
		System.out.printf("avg : %.1f\n", avg);
	}
}
