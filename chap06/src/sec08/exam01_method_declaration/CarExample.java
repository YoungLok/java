package sec08.exam01_method_declaration;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar= new Car();
		myCar.setGas(5);
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("����մϴ�.");
			myCar.run();	
		}
		
		
	}

}
