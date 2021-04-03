package sec04.exam01_overriding;

public class Computer extends Calculator {
	//어노테이션:컴파일러에게 코드를 검증을 요청한다
	@Override
	double areaCircle(double r) {
		// TODO Auto-generated method stub
		//return super.areaCircle(r);
		System.out.println("Computer 객체의 areaCircle()실행");
		return Math.PI*r*r;
	}
	
	
}
