package sec08.exam01_method_declaration;

public class Calculator {
	//Ŭ������ ���� ���
	//�ʵ�
	//������
	Calculator(){
		
	}
	//�޼ҵ�
	void powerOn() {
		System.out.println("������ �մϴ�");
	}
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	double divide(double x, double y) {
		
		double result =(x/y);
		return result;
		
	}
	void powerOff() {
		System.out.println("������ ���ϴ�");
	}
}
