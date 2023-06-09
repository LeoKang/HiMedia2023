package sec01.exam01;

public class SmartTelevisionExample {
	public static void main(String[] args) {
//		5 : SmartTelevision
//		7 : RemoteControl
//		13 : Searchable
		SmartTelevision tv = new SmartTelevision();

		RemoteControl rc = tv;
		rc.turnOn();
		rc.setVolume(8);
//		rc.search("");
		rc.turnOff();

		Searchable searchable = tv;
//		searchable.setVolume(7);
		searchable.search("www.google.com");

		tv.turnOn();
		tv.setVolume(6);
		tv.search("www.naver.com");
		tv.turnOff();
	}
}
