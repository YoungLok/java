package sec07.exam05_method_polymorphism;

public class DriverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver =new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		Vehicle v= new Vehicle();
		//Vehicle v=bus;
		driver.drive(bus);
		driver.drive(taxi);
		driver.drive(v);
		
	}

}
