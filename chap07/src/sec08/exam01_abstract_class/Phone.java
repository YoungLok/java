package sec08.exam01_abstract_class;

public abstract class Phone {
	//추상클래스의 구성 멤버
	//필드
	
	public String owner;
	//생성자
	public Phone(String owner) {
		this.owner = owner;
	}
	//메소드(일반메소드,추상메소드)
	//추상메소드는 실행문이 없기때문에 자식클래스에서 꼭 재정의 해줘야한다.
	public abstract void turnOff();
	
	//일반 메소드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
}
