package sec05.exam05_instanceof;

public class DriverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver =new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//Vehicle v=bus;
		driver.drive(bus);
		driver.drive(taxi);
	}

}
