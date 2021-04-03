package sec04.exam02_super;

public class SupersoniccAirplaneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SupersonicAirplane sa= new SupersonicAirplane();
		Airplane  x= sa;
		sa.takeOff();
		
		sa.fly();
		
		sa.flyMode=SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode=SupersonicAirplane.NORMAL;
		sa.fly();
		
		sa.land();
	}

}
