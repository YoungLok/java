package sec08.exam04_overloading;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator myCalc =new Calculator();
		//���簢���� ���� ���ϱ�
		double result1 = myCalc.areaRectangle(10);
		System.out.println("���簢���� ����="+result1);
		
		//���簢���� ���� ���ϱ�
		double result2 = myCalc.areaRectangle(10, 20);
		System.out.println("���簢���� ����="+result2);
	}

}
