package sec07.exam03_constructor_overloading;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		System.out.println("car.company="+car1.company);
		System.out.println("car.model="+car1.model);
		
		Car car2= new Car("자가용");
		System.out.println("car.company="+car2.company);
		System.out.println("car.model="+car2.model);
		System.out.println("car.color="+car2.color);
		
		Car car3= new Car("자가용","빨강");
		System.out.println("car.company="+car3.company);
		System.out.println("car.model="+car3.model);
		System.out.println("car.color="+car3.color);
		System.out.println("car.maxspeed="+car3.maxSpeed);
		
		Car car4= new Car("자가용","빨강",300);
		System.out.println("car.company="+car4.company);
		System.out.println("car.model="+car4.model);
		System.out.println("car.color="+car4.color);
		System.out.println("car.maxspeed="+car4.maxSpeed);
	}

}
