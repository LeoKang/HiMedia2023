package p280;

public class SingletonExample {
	public static void main(String[] args) {
//		Singleton s1 = new Singleton();
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();

		if (obj1 == obj2) {
			System.out.println("같은 singleton 객체 입니다.");
		} else {
			System.out.println("다른 singleton 객체 입니다.");
		}
	}
}
