package sec07.exam07_instanceof;

public class InstanceofExample {
	
	public static void method1(Parents parents) {
		if(parents instanceof Child) {
			Child child = (Child) parents;
			System.out.println("method1-Child로 변환 성공");
		}else {
			System.out.println("method1-Child로 변환하지 않음");
		}
	}
	public static void method2(Parents parents) {
		Child child=(Child) parents;
		System.out.println("method2-Child로 변환 성공");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parents parentsA=new Child();
		method1(parentsA);
		method2(parentsA);
	}

}
