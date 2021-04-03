package secc07.exam06_casting;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent =new Child();//자동 형변환
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		//parent.field2();
		//parent.field3();
		Child child=(Child)parent;//강제 형변환
		child.field2="yyy";
		child.method3();

	}

}
