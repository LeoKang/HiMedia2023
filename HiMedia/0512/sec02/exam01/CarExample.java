package sec02.exam01;

import sec02.exam01.p390.Car;

public class CarExample2 {
	public static void main(String[] args) {
		Car myCar = new Car();

		System.out.println("제작회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색깔 : " + myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed);
		System.out.println("현재속도 : " + myCar.speed);

		// field값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도 : " + myCar.speed);

		Car genesis = new Car();
		genesis.model = "g80";
		genesis.color = "빨강";
		genesis.maxSpeed = 400;
		genesis.speed = 120;
		
		System.out.println("제작회사 : " + genesis.company);
		System.out.println("모델명 : " + genesis.model);
		System.out.println("색깔 : " + genesis.color);
		System.out.println("최고속도 : " + genesis.maxSpeed);
		System.out.println("현재속도 : " + genesis.speed);
	}
}
