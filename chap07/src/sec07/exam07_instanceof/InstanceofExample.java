package sec07.exam07_instanceof;

public class InstanceofExample {
	
	public static void method1(Parents parents) {
		if(parents instanceof Child) {
			Child child = (Child) parents;
			System.out.println("method1-Child�� ��ȯ ����");
		}else {
			System.out.println("method1-Child�� ��ȯ���� ����");
		}
	}
	public static void method2(Parents parents) {
		Child child=(Child) parents;
		System.out.println("method2-Child�� ��ȯ ����");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parents parentsA=new Child();
		method1(parentsA);
		method2(parentsA);
	}

}
