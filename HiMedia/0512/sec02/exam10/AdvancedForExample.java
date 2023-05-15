package sec02.exam10;

public class AdvancedForExample {
	public static void main(String[] args) {
		int[] scores = { 95, 71, 84, 93, 87 };

		// 1. 향상된 for문
		int sum = 0;
		for (int score : scores) {
			sum = sum + score;
		}
		System.out.println("점수 총합 = " + sum);

		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 : " + avg);

		// 2. 일반 for문
		int sum2 = 0;
		for (int i = 0; i < scores.length; i++) {
			sum2 += scores[i];
		}
		System.out.println("점수 총합 = " + sum2);

		double avg2 = (double) sum2 / scores.length;
		System.out.println("점수 평균 : " + avg2);

		// 3. 홀수번째 학생 점수 합
		for (int i = 0; i < scores.length; i += 2) {
			System.out.print(scores[i] + " ");
		}
		System.out.println();
		
		for (int i = 2; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
		}
	}
}










