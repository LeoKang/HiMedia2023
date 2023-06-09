package sec01.exam01;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		rc.setVolume(7);
		rc.turnOff();

		rc = new Audio();
		rc.turnOn();
		rc.setVolume(-10);
		rc.turnOff();
	}
}
