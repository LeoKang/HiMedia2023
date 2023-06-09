package p431.sec02.exam02;

public class Anonymous {
	RemoteControl field = new RemoteControl() {

		public void turnOn() {
			System.out.println("TV를 켭니다.");

		}

		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	};

	void method1() {
		RemoteControl localVar = new RemoteControl() {

			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				System.out.println("Audio를 켭니다.");
			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				System.out.println("Audio를 끕니다.");
			}
		};
	}

	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}
