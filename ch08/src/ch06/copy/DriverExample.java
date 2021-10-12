package ch06.copy;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		/*Vehicle vehicle ;
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		vehicle = taxi;
		taxi = (Taxi)vehicle;
		taxi.checkFare();
		
		vehicle = bus;
		bus = (bus)vehicle;
		bus.checkFare();*/
		
		driver.drive(new Bus());
		driver.drive(new Taxi());
	}	
	
}
