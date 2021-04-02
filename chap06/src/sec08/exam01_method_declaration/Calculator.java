package sec08.exam01_method_declaration;

public class Calculator {
	//클래스의 구성 멤버
	//필드
	//생성자
	Calculator(){
		
	}
	//메소드
	void powerOn() {
		System.out.println("전원을 켭니다");
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
		System.out.println("전원을 끕니다");
	}
}
