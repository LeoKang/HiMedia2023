package sec01.exam01;

public class MyClass {
	RemoteControl rc = new Television();
	
	MyClass() {}
		// RenoteControl rc = new Audio();
	MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(6);
	}
	
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(7);
	}
}
