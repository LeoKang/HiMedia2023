package sec03.exam01;

import java.util.Calendar;

public class EnumWeekExample {
	public static void main(String[] args) {
		int today = 0;

		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		
		switch (week) {
		case 1:
//			today = Week.SUNDAY;
			today = 1;
			break;
		case 2:
//			today = Week.MONDAY;
			today = 2;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WENDESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		System.out.println("오늘 요일: " + today);

		if (today == Week.SUNDAY) {
			System.out.println("일요일에는 정올을 풉니다.");
		} else {
			System.out.println("열심히 자바 공부합니다.");
		}
	}
}
