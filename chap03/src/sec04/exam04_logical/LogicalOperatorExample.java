package sec04.exam04_logical;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int charCode = 'A'; //65
		
		if((charCode>=65)&(charCode<=90)) {
			System.out.println("�빮�� �Դϴ�");
		}

		if((charCode>=97)&(charCode<=122)) {
			System.out.println("�ҹ��� �Դϴ�");
		}
		
		int value = 6;
		
		if( ( value%2==0) || (value%3==0) ) {
			System.out.println("2�Ǵ� 3�� ����Դϴ�");
		}
	}

}
