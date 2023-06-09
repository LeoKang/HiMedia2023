package sec02.exam02;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//Vehicle vehicle = bus;
		//Vehicle vehicle = taxi;
		driver.drive(bus);
		driver.drive(taxi);
	}
}
