package secc07.exam06_casting;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent =new Child();//�ڵ� ����ȯ
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		//parent.field2();
		//parent.field3();
		Child child=(Child)parent;//���� ����ȯ
		child.field2="yyy";
		child.method3();

	}

}
